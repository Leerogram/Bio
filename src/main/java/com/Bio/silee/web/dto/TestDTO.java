package com.Bio.silee.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
/**
 * lombok dto
 * @author 이상일
 * @version 1.0
 * (2020.01.06) 이상일, 최초 작성
 */
@Getter
@RequiredArgsConstructor
public class TestDTO {
    private final String Testid;
    private final String Testpwd;
}
