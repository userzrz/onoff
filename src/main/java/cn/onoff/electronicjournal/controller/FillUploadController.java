package cn.onoff.electronicjournal.controller;

import cn.onoff.electronicjournal.utils.FastDFSClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 实现文件上传
 * @Author ZHENG
 * @Data 2020/6/4 15:24
 * @VERSION 1.0
 **/
@Slf4j
@RestController
public class FillUploadController {

    @PostMapping(value = "/upload")
    public Map singleFileUpload(@RequestParam("file") MultipartFile[] file) {
        Map<String, String> map = new HashMap<>();
        int i = 0;
        for (MultipartFile f : file) {
            if (f.isEmpty()) {
                map.put("message", "上传文件为空");
                return map;
            }
            try {
                String path = FastDFSClient.saveFile(f);
                map.put("fileName" + i++, f.getOriginalFilename());
                map.put("fileUrl" + i++, path);
            } catch (Exception e) {
                log.error("upload file failed", e);
            }
        }
        return map;
    }


}

