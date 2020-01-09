package com.Bio.silee.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.CoreMatchers.is;

/**
 * junit 컨트롤러 테스트
 * @author 이상일
 * @version 1.0
 * (2020.01.06) 이상일, 최초 작성
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class) // @WebMvcTest 를 사용하는 경우 @Service, @Component, @Repository 등 을 사용할 수 없다.
// 2020.01.09 PostApiControllerTest 테스트 후에 해당 테스트 실행시 오류 -> @WebMvcTest에  (UserController.class) 범위 설정
public class UserControllerTest {
        @Autowired
        private MockMvc mock;

        @Test
        public void Test() throws Exception {

            mock.perform(MockMvcRequestBuilders.get("/user/getTest"))
                    .andExpect(MockMvcResultMatchers.status().isOk()) //http Header Status 검증
                    .andExpect(MockMvcResultMatchers.content().string("리턴 성공!"));// 본문 내용 검증
        }

        @Test
        public void helloDto_return() throws Exception {
                String name  = "sangil";
                String pwd = "pwd";
                //200106 .andExpect(MockMvcResultMatchers.jsonPath("$.testid", is("sangil"))) can not reserved Method
                mock.perform(MockMvcRequestBuilders.get("/user/dto")
                .param("testid", name).param("testpwd", pwd))
                        .andExpect(MockMvcResultMatchers.status().isOk())
                        .andExpect(MockMvcResultMatchers.jsonPath("$.testid", is("sangil")))
                        .andExpect(MockMvcResultMatchers.jsonPath("$.testpwd", is("pwd")));
        }
}
