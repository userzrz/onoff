package cn.onoff.electronicjournal.controller.wechat;

import cn.onoff.electronicjournal.model.wechat.WeChat;
import cn.onoff.electronicjournal.service.WeChatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/7/9 13:57
 * @VERSION 1.0
 **/
@Slf4j
@RestController
public class WeChatController {

    @Autowired
    WeChatService service;

    /**
     * 验证微信请求接口
     *
     * @param weChat
     * @return
     */
    @GetMapping(value = "/wx/test")
    public String check(WeChat weChat) {
        if (service.check(weChat)) {
            return weChat.getEchostr();
        } else {
            return null;
        }
    }


    /**
     * 接受消息和事件推送
     */
    @PostMapping(value = "/wx/test")
    public void recvMessage(HttpServletRequest request) {
        try {
            Map<String, String> map = service.parseRequest(request.getInputStream());
            log.info("---------->" + map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
