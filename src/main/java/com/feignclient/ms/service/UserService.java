package com.feignclient.ms.service;

import com.feignclient.ms.client.UserFeignClient;
import com.feignclient.ms.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserFeignClient feignClient;

    public List<UserDTO> getUsers() {
        return feignClient.getUsers();
    }

    public void saveUser(UserDTO user) {
        feignClient.saveUser(user);
    }

    public void updateUser(Integer id, UserDTO user) {
        feignClient.updateUser(id, user);
    }

    public void deleteUser(Integer id) {
        feignClient.deleteUser(id);
    }
}
