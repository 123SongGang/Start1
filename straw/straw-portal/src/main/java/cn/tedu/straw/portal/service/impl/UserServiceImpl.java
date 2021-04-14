package cn.tedu.straw.portal.service.impl;

import cn.tedu.straw.portal.model.User;
import cn.tedu.straw.portal.mapper.UserMapper;
import cn.tedu.straw.portal.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tedu.cn
 * @since 2021-01-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
