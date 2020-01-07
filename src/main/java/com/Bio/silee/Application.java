package com.Bio.silee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 사용자 관련 컨트롤러
 * @author 이상일
 * @version 1.0
 * (2020.01.06) 이상일, 최초 작성
 */
@SpringBootApplication //스프링 bean 생성 및 읽기 자동으로 설정, 현재 위치부터 패키지 스캔 -> 프로젝트 최상단 위치 권장
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}



