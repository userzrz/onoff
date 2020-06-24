package cn.onoff.electronicjournal.model.DO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/17 21:41
 * @VERSION 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JournalDO implements Serializable {

    private String id;

    private String title;

    private String periodical;

    private String intro;

    private String time;

    private String pviews;

    private String image_url;
}
