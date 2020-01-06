package com.silee.Bio.user.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * 사용자 정보를 담는 domain
 * @author 이상일
 * @version 1.0
 * (2020.01.03) 이상일, 최초 작성
 */

@Entity
public class Users {
    @Id
    String USERNAME;

    String PASSWD;
    LocalDateTime REG_DATE;
    String USERROLE;
    String EMAIL;

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWD() {
        return PASSWD;
    }

    public void setPASSWD(String PASSWD) {
        this.PASSWD = PASSWD;
    }

    public LocalDateTime getREG_DATE() {
        return REG_DATE;
    }

    public void setREG_DATE(LocalDateTime REG_DATE) {
        this.REG_DATE = REG_DATE;
    }

    public String getUSERROLE() {
        return USERROLE;
    }

    public void setUSERROLE(String USERROLE) {
        this.USERROLE = USERROLE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
}
