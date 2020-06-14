package cn.onoff.electronicjournal.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/10 18:38
 * @VERSION 1.0
 **/
@Data
public class Admin implements Serializable {

    private String id;

    private String account;

    private String password;
}
