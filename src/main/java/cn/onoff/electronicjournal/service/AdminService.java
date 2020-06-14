package cn.onoff.electronicjournal.service;

import cn.onoff.electronicjournal.model.Admin;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/10 13:31
 * @VERSION 1.0
 **/

public interface AdminService {

    Admin getAdmin(String account, String passWord);

}
