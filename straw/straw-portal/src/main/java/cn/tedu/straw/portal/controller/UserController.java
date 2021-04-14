package cn.tedu.straw.portal.controller;


import cn.tedu.straw.portal.model.User;
import cn.tedu.straw.portal.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tedu.cn
 * @since 2021-01-13
 */
@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private IUserService userService;

    //实际访问路径为:localhost:8080/v1/users/get?id=1
    @GetMapping("/get")
    @PreAuthorize("hasAuthority('/user/get')")//设置访问这个方法的特殊权限
    public User get(Integer id){
        User u=userService.getById(id);
        return u;
    }
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('/user/list')")
    public List<User> list(){
        List<User> list=userService.list();
        return list;
    }


}
