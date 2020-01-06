package com.silee.Bio.user.service;

import com.silee.Bio.user.domain.Users;
import com.silee.Bio.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 사용자 관련 서비스
 * @author 이상일
 * @version 1.0
 * (2019.11.26) 이상일, 최초 작성
 */
@Service
public class UserService implements UserInterface {
    @Autowired
    private UserRepository userRepo;


    // 사용자 정보 저장
    @Override
    public void InputUserInfo(Users users) {
        userRepo.save(users);
    }
    //사용자 정보 조회
    @Override
    public void FindUserInfo(Users users) {
        userRepo.findById(users.getUSERNAME());
    }
    //사용자 정보 수정
    @Override
    public void ModifyUserInfo(Users users) {
        userRepo.save(users);
    }
    //사용자 정보 삭제
    @Override
    public void DeleteUserInfo(Users users) {
        userRepo.delete(users);
    }
}
