package cn.onoff.electronicjournal.model.DO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/17 23:29
 * @VERSION 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PictureDO implements Serializable {

    //组名
    private String groupName;

    //远程文件名
    private String remoteFileName;
}
