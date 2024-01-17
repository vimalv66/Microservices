package com.User.UserService.service;

import com.User.UserService.Entity.CustomUser;

import com.User.UserService.VO.Department;
import com.User.UserService.VO.ResponseTemplateVO;
import com.User.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public CustomUser save(CustomUser user) {

        return userRepository.save(user);
    }


    public ResponseTemplateVO getUserwithDepartment(Long userid) {
         ResponseTemplateVO vo=new ResponseTemplateVO();
         CustomUser user= userRepository.findByUserid(userid);

         Department department=restTemplate.getForObject("http://localhost:9001/department/"+user.getId(),Department.class);
         vo.setUser(user);
         vo.setDepartment(department);
         return vo;

    }


}


