package cn.tedu.straw.portal.service.impl;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String name)
            throws UsernameNotFoundException {
        UserDetails user=null;
        //判断用户是不是jerry
        if("jerry".equals(name)){
            //设置jerry用户的详情
            user= User.builder()
                    .username("jerry")
                    .password("{bcrypt}$2a$10$ytxmGeWcRZObqoDmlhnWxe6KqUjb9DTONmQVKkmwneHQtZw4LQtiq")
                    .authorities("/user/get")
                    .build();
        }
        return user;
    }
}



