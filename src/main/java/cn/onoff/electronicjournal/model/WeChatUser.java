package cn.onoff.electronicjournal.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/22 23:13
 * @VERSION 1.0
 **/
@Data
public class WeChatUser implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * open_id
     */
    private String openId;
    /**
     * skey
     */
    private String skey;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    /**
     * 最后登录时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lastVisitTime;
    /**
     * session_key
     */
    private String sessionKey;
    /**
     * 市
     */
    private String city;
    /**
     * 省
     */
    private String province;
    /**
     * 国
     */
    private String country;
    /**
     * 头像
     */
    private String avatarUrl;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 网名
     */
    private String nickName;
}
