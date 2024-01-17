package com.User.UserService.VO;

import com.User.UserService.Entity.CustomUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private  Department department;
    private CustomUser user;
}
