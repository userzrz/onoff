package cn.onoff.electronicjournal.service;

import cn.onoff.electronicjournal.model.Journal;

import java.util.List;

public interface BackService {
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
