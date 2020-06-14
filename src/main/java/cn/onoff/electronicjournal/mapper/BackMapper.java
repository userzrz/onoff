package cn.onoff.electronicjournal.mapper;

import cn.onoff.electronicjournal.model.Journal;

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
    int addJounal(Journal journal);

    /**
     * 查询全部电子刊
     *
     * @return
     */
    List<Journal> queryJournal();

}
