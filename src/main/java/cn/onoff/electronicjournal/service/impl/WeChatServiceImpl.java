package cn.onoff.electronicjournal.service.impl;

import cn.onoff.electronicjournal.model.wechat.WeChat;
import cn.onoff.electronicjournal.service.WeChatService;
import cn.onoff.electronicjournal.utils.WechatUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/7/9 19:27
 * @VERSION 1.0
 **/
@Service
public class WeChatServiceImpl implements WeChatService {

    /**
     * 验证消息是否来自微信服务器
     *
     * @param weChat
     * @return
     */
    public boolean check(WeChat weChat) {
        // 1）将token、timestamp、nonce三个参数进行字典序排序
        String[] strs = new String[]{WechatUtil.TOKEN, weChat.getTimestamp(), weChat.getNonce()};
        Arrays.sort(strs);
        //2）将三个参数字符串拼接成一个字符串进行sha1加密
        String str = strs[0] + strs[1] + strs[2];
        String mysig = WechatUtil.sha1(str);
        //3）开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
        return mysig.equalsIgnoreCase(weChat.getSignature());
    }

    /**
     * 解析xml数据包
     *
     * @param is
     * @return
     */
    @Override
    public Map<String, String> parseRequest(InputStream is) {
        Map<String, String> map = new HashMap<>();
        SAXReader reader = new SAXReader();
        try {
            //读取输入流，获取文档对象
            Document document = reader.read(is);
            //根据文档对象获取根节点
            Element root = document.getRootElement();
            //获取节点的所有的子节点
            List<Element> elements = root.elements();
            for (Element e : elements) {
                map.put(e.getName(), e.getStringValue());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return map;
    }
}
