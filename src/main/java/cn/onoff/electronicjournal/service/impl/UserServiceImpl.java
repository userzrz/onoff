package cn.onoff.electronicjournal.service.impl;

import cn.onoff.electronicjournal.mapper.UserMapper;
import cn.onoff.electronicjournal.model.WeChatUser;
import cn.onoff.electronicjournal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/23 13:44
 * @VERSION 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public WeChatUser selectById(String openId) {
        return userMapper.selectById(openId);
    }

    @Override
    public int insert(WeChatUser user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateById(WeChatUser user) {
        return userMapper.updateById(user);
    }
}
