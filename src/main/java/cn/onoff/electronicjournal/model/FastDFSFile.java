package cn.onoff.electronicjournal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description 文件实体类
 * @Author ZHENG
 * @Data 2020/6/4 11:22
 * @VERSION 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FastDFSFile implements Serializable {
    /**
     * 文件名
     */
    private String name;

    /**
     * 内容
     */
    private byte[] content;

    /**
     * 文件后缀
     */
    private String ext;

    /**
     * 文件摘要
     */
    private String md5;

    /**
     * 作者
     */
    private String author;

    public FastDFSFile(String name, byte[] content, String ext) {
        this.name = name;
        this.content = content;
        this.ext = ext;
    }
}
