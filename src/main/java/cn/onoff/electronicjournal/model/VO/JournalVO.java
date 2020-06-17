package cn.onoff.electronicjournal.model.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/11 17:39
 * @VERSION 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JournalVO implements Serializable {

    private String title;

    private String periodical;

    private MultipartFile[] files;

    private String intro;
}
