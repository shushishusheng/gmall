package cn.excellentpeople.gmall.user.service.impl;

import cn.excellentpeople.gmall.bean.UmsMember;
import cn.excellentpeople.gmall.service.UserService;


import cn.excellentpeople.gmall.user.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * @author 舒丑澳
 * @version 1.0
 * 类描述:
 * @date 2019/10/12 11:30
 **/
@Service
public class UserServiceImpl implements UserService {

   @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {

        //;
        List<UmsMember> umsMember = userMapper.selectAllUser();


        return umsMember;
    }
}
