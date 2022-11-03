package com.feignclient.ms.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@Data
public class UserDTO {

    private Integer id;
    private String name;
    private String username;
    private String email;
    private String avatar;

}
