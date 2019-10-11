package lam.com.cn.entity;



import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName(value = "user_info")
public class UserInfo extends BaseBean implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String userName;

    private String password;

    private String mobileNumber;

    private String email;

    private String headPortrait;

    private String company;

    private Date lastLoginTime;

    private String wxOpenid;

    private String qqOpenid;

    @TableField(exist = false)
    private String verifyCode;

}
