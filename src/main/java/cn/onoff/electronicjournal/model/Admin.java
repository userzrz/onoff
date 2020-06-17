package cn.onoff.electronicjournal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description 后台登录类
 * @Author ZHENG
 * @Data 2020/6/10 18:38
 * @VERSION 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin implements Serializable {

    private String id;

    private String account;

    private String password;
}
