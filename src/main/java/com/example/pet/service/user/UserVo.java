package com.example.pet.service.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVo {
    private String email;
    private String password;
    private String createDat;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserVo{");
        sb.append("email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", createDat='").append(createDat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
