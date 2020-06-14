package cn.onoff.electronicjournal.model;

import lombok.Data;
import org.springframework.util.StringUtils;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/11 16:16
 * @VERSION 1.0
 **/
@Data
public class Journal implements Serializable {

    private String id;

    //标题
    private String title;

    //刊期
    private String periodical;

    //发布时间
    private long time;

    //封面图片地址
    private String image_url;

    //阅读量
    private String pviews;

    //简介
    private String intro;


}
