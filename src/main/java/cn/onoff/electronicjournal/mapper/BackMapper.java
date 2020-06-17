package cn.onoff.electronicjournal.mapper;

import cn.onoff.electronicjournal.model.DO.JournalDO;
import cn.onoff.electronicjournal.model.Journal;
import cn.onoff.electronicjournal.model.Picture;

import java.util.List;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/11 16:31
 * @VERSION 1.0
 **/
public interface BackMapper {

    /**
     * 新增电子刊
     *
     * @param journal
     * @return
     */
    Integer addJounal(Journal journal);

    /**
     * 新增图片信息
     *
     * @param picture
     * @return
     */
    int addPicture(Picture picture);

    /**
     * 查询全部电子刊
     *
     * @return
     */
    List<JournalDO> queryJournal();

}
