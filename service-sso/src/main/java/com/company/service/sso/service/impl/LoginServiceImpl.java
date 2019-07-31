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

    /**
     * 用户登录：根据登陆账号查找是否存在该用户，然后比对密码是否正确
     * @param loginCode
     * @param plainPassword
     * @return 登陆成功，返回tbUser，否则返回null
     */
    @Override
    public TbUser login(String loginCode, String plainPassword) {
        Example example = new Example(TbUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("loginCode", loginCode);
        TbUser tbUser = tbUserMapper.selectOneByExample(example);
        if (tbUser == null) {
            return null;
        } else {
            if (plainPassword.equals(tbUser.getPassword())) {
                return tbUser;
            }
        }
        return null;
    }
}
