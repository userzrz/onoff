package cn.onoff.electronicjournal.service;

import cn.onoff.electronicjournal.model.wechat.WeChat;

import java.io.InputStream;
import java.util.Map;


public interface WeChatService {
    /**
     * 验证消息是否来自微信服务器
     *
     * @param weChat
     * @return
     */
    boolean check(WeChat weChat);

    /**
     * 解析xml数据包
     *
     * @param is
     * @return
     */
    Map<String, String> parseRequest(InputStream is);
}
