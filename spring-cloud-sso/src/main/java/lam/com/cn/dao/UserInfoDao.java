package lam.com.cn.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import lam.com.cn.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserInfoDao extends BaseMapper<UserInfo> {
    UserInfo selectUser(@Param("userName") String userName, @Param("password") String password);
}
