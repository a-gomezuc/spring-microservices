package github.agomezuc.taskservice.client;

import github.agomezuc.taskservice.domain.Owner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("account-service")
public interface AccountClient {

    @RequestMapping(method = RequestMethod.POST, value = "accounts")
    Owner saveAccount(Owner owner);
}
