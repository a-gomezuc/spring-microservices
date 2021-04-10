package github.agomezuc.taskservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import github.agomezuc.taskservice.client.AccountClient;
import github.agomezuc.taskservice.domain.Owner;
import github.agomezuc.taskservice.domain.Task;
import github.agomezuc.taskservice.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("tasks")
public class TaskController {

    private TaskService taskService;
    private AccountClient accountClient;

    public TaskController(TaskService taskService, AccountClient accountClient) {
        this.taskService = taskService;
        this.accountClient = accountClient;
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }


    @PostMapping
    @HystrixCommand(fallbackMethod = "fallBackSaveTask")
    public Task saveTask(@RequestBody @Valid Task task) {
        Owner owner = accountClient.saveAccount(task.getOwner());
        log.info("Owner saved into accounts: {}", owner);
        return taskService.saveTask(task);
    }

    public Task fallBackSaveTask(Task task, Throwable throwable) {
        log.error("Error saving task: {}", task);
        return new Task(0L, new Owner(), "Error:" + throwable.getMessage(), LocalDateTime.now(), "HIGH");
    }

}