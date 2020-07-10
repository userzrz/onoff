package cn.onoff.electronicjournal.model.wechat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 验证微信get请求
 *
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/7/9 14:09
 * @VERSION 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WeChat {

    private String signature;

    private String timestamp;

    private String nonce;

    private String echostr;
}
