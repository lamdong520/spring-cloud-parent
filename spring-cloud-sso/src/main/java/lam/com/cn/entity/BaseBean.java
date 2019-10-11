package lam.com.cn.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: hybim
 * @ClassName: BaseBean
 * @company: 鸿业（深圳）信息技术服务有限公司
 * @author: Lamdong
 * @create: 2019-08-14 15:50
 **/
@Data
public class BaseBean {
    /**
     * 状态(0正常1删除)
     */
    private Integer status;
    /**
     * 创建人
     */
    private Integer createUser;
    /**
     * 创建时间
     */
    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
    /**
     * 更新时间
     */
    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;
    /**
     * 更新ren
     */
    private Integer updateUser;

}
