package lam.com.cn.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @program: spring-cloud-parent
 * @ClassName: RedisUtil
 * @company: 鸿业（深圳）信息技术服务有限公司
 * @author: Lamdong
 * @create: 2019-10-10 19:37
 **/
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 存放string类型
     *
     * @param key
     *            key
     * @param data
     *            数据
     * @param timeout
     *            超时间
     */
    public void setString(String key, String data, Long timeout) {
        stringRedisTemplate.opsForValue().set(key, data);
        if (timeout != null) {
            stringRedisTemplate.expire(key, timeout, TimeUnit.SECONDS);
        }
    }

    /**
     * 存放string类型
     *
     * @param key
     *            key
     * @param object
     *            数据
     * @param timeout
     *            超时间
     */
    public void setObject(String key, Object object, Long timeout) {
        redisTemplate.opsForValue().set(key, object);
        if (timeout != null) {
            redisTemplate.expire(key, timeout, TimeUnit.SECONDS);
        }
    }



    /**
     * 存放string类型
     *
     * @param key
     *            key
     * @param data
     *            数据
     */
    public void setString(String key, String data) {
        setString(key, data, null);
    }

    /**
     * 存放object类型
     *
     * @param key
     *            key
     * @param object
     *            数据
     */
    public void setObject(String key, Object object) {
        setObject(key, object, null);
    }

    /**
     * 根据key查询string类型
     *
     * @param key
     * @return
     */
    public String getString(String key) {
        String value = stringRedisTemplate.opsForValue().get(key);
        return value;
    }

    /**
     * 根据key查询object类型
     *
     * @param key
     * @return
     */
    public Object getObject(String key) {
        Object object = redisTemplate.opsForValue().get(key);
        return object;
    }

    /**
     * 根据对应的key删除key
     *
     * @param key
     */
    public boolean remove(String key) {
        return stringRedisTemplate.delete(key);
    }
}

