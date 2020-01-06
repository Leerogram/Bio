package com.Bio.silee.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * testDTO 테스트
 * @author 이상일
 * @version 1.0
 * (2020.01.06) 이상일, 최초 작성
 */
public class UsersResponseTest {
    @Test
    public void lombokUnitTest() {
        //given
        String testid = "userTest1";
        String testpwd = "userTest_Passwd1";

        //when
        TestDTO resTest = new TestDTO(testid, testpwd);

        //then
        assertThat(resTest.getTestid()).isEqualTo(testid);
        assertThat(resTest.getTestpwd()).isEqualTo(testpwd);
    }
}
