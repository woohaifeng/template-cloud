package com.company.service.sso.service.impl;

import com.company.common.domain.TbUser;
import com.company.service.sso.mapper.TbUserMapper;
import com.company.service.sso.service.LoginService;
import com.company.service.sso.service.consumer.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private TbUserMapper tbUserMapper;

    @Autowired
    private RedisService redisService;

    @Override
    public TbUser login(String loginCode, String plainPassword) {
        Example example = new Example(TbUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("loginCode",loginCode);
        TbUser user = tbUserMapper.selectOneByExample(example);
        return user;
    }
}
