package cn.tedu.straw.portal;


import cn.tedu.straw.portal.mapper.TagMapper;
import cn.tedu.straw.portal.model.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class StrawPortalApplicationTests {

    @Test
    void contextLoads() {

    }

    @Resource
    TagMapper tagMapper;
    @Test
    public void testTag(){

        Tag tag=tagMapper.selectById(1);
        System.out.println(tag);
        List<Tag> tags=tagMapper.selectList(null);
        for(Tag t: tags){
            System.out.println(t);
        }
    }

    @Autowired
    PasswordEncoder passwordEncoder;
    //加密
    @Test
    public void encode(){
        String pwd=passwordEncoder.encode("123456");
        System.out.println(pwd);
        //$2a$10$ytxmGeWcRZObqoDmlhnWxe6KqUjb9DTONmQVKkmwneHQtZw4LQtiq
    }
    //验证
    @Test
    public void decode(){
        boolean b=passwordEncoder.matches("123456",
   "$2a$10$ytxmGeWcRZObqoDmlhnWxe6KqUjb9DTONmQVKkmwneHQtZw4LQtiq");
        System.out.println(b);
    }







}
