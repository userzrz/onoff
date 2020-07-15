package cn.onoff.electronicjournal.mapper;

import cn.onoff.electronicjournal.model.WeChatUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/23 13:21
 * @VERSION 1.0
 **/
@Mapper
@Repository("userMapper")
public interface UserMapper {

    /**
     * 根据openid查询指定用户
     *
     * @param openId
     * @return
     */
    WeChatUser selectById(String openId);

    /**
     * 新增微信用户信息
     *
     * @param user
     * @return
     */
    int insert(WeChatUser user);

    /**
     * 修改用户最新登录时间及skey
     *
     * @param user
     * @return
     */
    int updateById(WeChatUser user);
}
