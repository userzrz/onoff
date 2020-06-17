package cn.onoff.electronicjournal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description 图片信息类
 * @Author ZHENG
 * @Data 2020/6/17 17:42
 * @VERSION 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Picture implements Serializable {

    //主键id
    private String id;

    //组名
    private String groupName;

    //远程文件名
    private String remoteFileName;

    //关联表journalId
    private String journalId;

    //图片路径
    private String imageUrl;

    //是否为封面0表示false
    private String cover;

}
