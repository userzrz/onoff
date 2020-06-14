package cn.onoff.electronicjournal.service.impl;

import cn.onoff.electronicjournal.mapper.BackMapper;
import cn.onoff.electronicjournal.model.Journal;
import cn.onoff.electronicjournal.service.BackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/11 16:30
 * @VERSION 1.0
 **/
@Service
public class BackServiceImpl implements BackService {

    @Autowired
    BackMapper backMapper;

    @Override
    public int addJounal(Journal journal) {
        return backMapper.addJounal(journal);
    }

    @Override
    public List<Journal> queryJournal() {
        return backMapper.queryJournal();
    }
}
