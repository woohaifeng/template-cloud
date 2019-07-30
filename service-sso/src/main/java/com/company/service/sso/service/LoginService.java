package com.company.service.sso.service;

import com.company.common.domain.User;

public interface LoginService {

    public User login(String loginCode,String plainPassword);

}
