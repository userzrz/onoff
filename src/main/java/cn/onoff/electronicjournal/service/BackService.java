package cn.onoff.electronicjournal.service;

import cn.onoff.electronicjournal.model.DO.JournalDO;
import cn.onoff.electronicjournal.model.DO.PictureDO;
import cn.onoff.electronicjournal.model.Journal;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BackService {
    /**
     * 新增电子刊
     *
     * @param journal
     * @return
     */
    int addJounal(Journal journal, MultipartFile[] files);

    /**
     * 查询全部电子刊
     *
     * @return
     */
    List<JournalDO> queryJournal();

    /**
     * 删除全部远程图片
     *
     * @return
     */
    void deleteAllPictureDO();

    /**
     * 删除指定电子刊数据
     *
     * @return
     */
    int deleteJounal(String journalId);

}
