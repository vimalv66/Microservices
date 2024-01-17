package com.User.UserService.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Long id;
    private String dname;
    private String daddress;
    private String dcode;
}
