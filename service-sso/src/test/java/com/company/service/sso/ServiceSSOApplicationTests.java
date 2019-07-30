package com.company.service.sso;

import com.company.common.domain.User;
import com.company.service.sso.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceSSOApplication.class)
@ActiveProfiles(value = "dev")
public class ServiceSSOApplicationTests {
    @Autowired
    private LoginService loginService;
    @Test
    public void test() {
        User user = loginService.login("andy","123");
        System.out.println(user.toString());

    }
}
