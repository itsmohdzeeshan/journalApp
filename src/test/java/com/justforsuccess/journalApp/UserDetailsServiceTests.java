package com.justforsuccess.journalApp;

import com.justforsuccess.journalApp.entity.User;
import com.justforsuccess.journalApp.service.UserDetailsServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;

@Disabled
@SpringBootTest
public class UserDetailsServiceTests {

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Test
    public void loadUserByUsername() {
        UserDetails user = userDetailsService.loadUserByUsername("ali");
//        Assertions.assertEquals();
    }

}
