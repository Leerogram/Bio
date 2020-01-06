package com.green.controller;

import com.green.user.domain.Users;
import com.green.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * 사용자 관련 컨트롤러
 * @author 이상일
 * @version 1.0
 * (2020.01.03) 이상일, 최초 작성
 */
@RestController
@RequestMapping(value = "user/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "join")
    public void InputUser(Users users) throws Exception {
        users.setUSERNAME("bootJpaTester1");
        users.setPASSWD("bootJpaTester1");
        users.setEMAIL("bootJpaTester1@gmail.com");
        users.setREG_DATE(LocalDateTime.now());
        users.setUSERROLE("user");
        userService.InputUserInfo(users);
    }
    @RequestMapping(value = "delete")
    public void DeleteUser(Users users) throws Exception {
        users.setUSERNAME("bootJpaTester1");
        userService.DeleteUserInfo(users);
    }
    @RequestMapping(value = "modify")
    public void ModifyUser(Users users) throws Exception {
        users.setPASSWD("bootJpaTester2");
        userService.ModifyUserInfo(users);
    }
    @RequestMapping(value = "find")
    public void FindUserById(Users users) throws Exception {
        users.setUSERNAME("bootJpaTester1");
        userService.FindUserInfo(users);
    }

}
