package cn.onoff.electronicjournal.controller;

import cn.onoff.electronicjournal.service.BackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 实现文件上传
 * @Author ZHENG
 * @Data 2020/6/4 15:24
 * @VERSION 1.0
 **/
@Slf4j
@RestController
public class ActionController {

    @Autowired
    BackService service;

    @GetMapping(value = "/deleteallpicture")
    public String deleteAllPictureDO() {
        //service.deleteAllPictureDO();
        return "全部删除成功";
    }

}

