package com.Bio.silee.web;

import com.Bio.silee.web.dto.TestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 사용자 관련 컨트롤러
 * @author 이상일
 * @version 1.0
 * (2020.01.03) 이상일, 최초 작성
 */
@RestController
@RequestMapping(value = "user/")
public class UserController {

    @GetMapping("getTest")
    public String test() {
        String test ="리턴 성공!";
        return test;
    }

    @GetMapping("dto")
    public TestDTO helloDto(@RequestParam("testid") String name, @RequestParam("testpwd") String pwd) {
        return new TestDTO(name, pwd);
    }
}
