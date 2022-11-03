package com.feignclient.ms.client;

import com.feignclient.ms.config.FeignClientConfig;
import com.feignclient.ms.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}", configuration = FeignClientConfig.class)
public interface UserFeignClient {

    @GetMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<UserDTO> getUsers();

    @PostMapping(value = "users", consumes = MediaType.APPLICATION_JSON_VALUE)
    UserDTO saveUser(@RequestBody UserDTO user);

    @PutMapping(value = ("/users/{id}"), consumes = MediaType.APPLICATION_JSON_VALUE)
    UserDTO updateUser(@PathVariable("id") Integer id, @RequestBody UserDTO user);

    @DeleteMapping(value = ("/users/{id}"), consumes = MediaType.APPLICATION_JSON_VALUE)
    UserDTO deleteUser(@PathVariable("id") Integer id);
}
