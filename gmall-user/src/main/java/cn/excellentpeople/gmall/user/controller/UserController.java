package cn.excellentpeople.gmall.user.controller;

import cn.excellentpeople.gmall.bean.UmsMember;
import cn.excellentpeople.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 舒丑澳
 * @version 1.0
 * 类描述:Ums表的访问
 * @date 2019/10/12 11:29
 **/

@Controller
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 测试接口
     * @return
     */
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello index";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){

        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;
    }
}
