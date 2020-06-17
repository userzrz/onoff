package cn.onoff.electronicjournal.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description 电子刊信息类
 * @Author ZHENG
 * @Data 2020/6/11 16:16
 * @VERSION 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Journal implements Serializable {

    private String id;

    //标题
    private String title;

    //刊期
    private String periodical;

    //发布时间
    private long time;

    //阅读量
    private String pviews;

    //简介
    private String intro;

    public Journal(String title, String periodical, long time, String intro) {
        this.title = title;
        this.periodical = periodical;
        this.time = time;
        this.intro = intro;
    }

}
