package cn.onoff.electronicjournal.service;

import cn.onoff.electronicjournal.model.WeChatUser;

public interface UserService {

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
