package com.green.user.service;

import com.green.user.domain.Users;

public interface UserInterface {
    public void FindUserInfo(Users users) throws  Exception;
    public void InputUserInfo(Users users) throws Exception;
    public void DeleteUserInfo(Users users) throws Exception;
    public void ModifyUserInfo(Users users) throws Exception;
}
