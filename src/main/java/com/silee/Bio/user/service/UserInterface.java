package com.silee.Bio.user.service;

import com.silee.Bio.user.domain.Users;

public interface UserInterface {
     void FindUserInfo(Users users) throws Exception;
     void InputUserInfo(Users users) throws Exception;
     void DeleteUserInfo(Users users) throws Exception;
     void ModifyUserInfo(Users users) throws Exception;
}
