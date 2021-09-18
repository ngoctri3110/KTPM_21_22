package com.se.springbootapi.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.se.springbootapi.entity.User;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UserDTO {

    private String email;

    private String fullName;

    private String phone;

    private String avatar;

    public UserDTO(User original){
        this.email = original.getEmail();
        this.fullName = original.getFullName();
        this.phone = original.getPhone();
        this.avatar = original.getAvatar();
    }
}
