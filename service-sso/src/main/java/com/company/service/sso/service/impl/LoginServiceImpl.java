package com.company.service.sso.service.impl;

import com.company.common.domain.User;
import com.company.service.sso.mapper.UserMapper;
import com.company.service.sso.service.LoginService;
import com.company.service.sso.service.consumer.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisService redisService;

    @Override
    public User login(String loginCode, String plainPassword) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("loginCode",loginCode);
        User user = userMapper.selectOneByExample(example);
        return user;
    }
}
