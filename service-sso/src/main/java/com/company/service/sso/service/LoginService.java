package com.company.service.sso.service;

import com.company.common.domain.TbUser;

public interface LoginService {

    public TbUser login(String loginCode, String plainPassword);

}
