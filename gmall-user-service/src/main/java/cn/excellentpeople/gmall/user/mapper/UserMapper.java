package cn.excellentpeople.gmall.user.mapper;


import cn.excellentpeople.gmall.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface UserMapper{

    List<UmsMember> selectAllUser();
}
