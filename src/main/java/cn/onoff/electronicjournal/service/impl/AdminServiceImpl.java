package cn.onoff.electronicjournal.service.impl;

import cn.onoff.electronicjournal.mapper.AdminMapper;
import cn.onoff.electronicjournal.model.Admin;
import cn.onoff.electronicjournal.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/10 14:19
 * @VERSION 1.0
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin getAdmin(String account, String passWord) {
        return adminMapper.getAdmin(account, passWord);
    }
}
