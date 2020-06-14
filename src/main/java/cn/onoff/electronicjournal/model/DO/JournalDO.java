package cn.onoff.electronicjournal.model.DO;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/11 17:39
 * @VERSION 1.0
 **/
@Data
public class JournalDO implements Serializable {

    private String title;

    private String periodical;

    private MultipartFile[] files;

    private String intro;
}
