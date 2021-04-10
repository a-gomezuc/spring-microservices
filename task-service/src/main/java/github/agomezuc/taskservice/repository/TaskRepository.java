package github.agomezuc.taskservice.repository;

import github.agomezuc.taskservice.domain.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, Long> {
}
