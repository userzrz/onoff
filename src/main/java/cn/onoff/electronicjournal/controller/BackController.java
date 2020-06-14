package cn.onoff.electronicjournal.controller;

import cn.onoff.electronicjournal.model.DO.JournalDO;
import cn.onoff.electronicjournal.model.Journal;
import cn.onoff.electronicjournal.service.BackService;
import cn.onoff.electronicjournal.utils.FastDFSClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/11 16:29
 * @VERSION 1.0
 **/
@Slf4j
@Controller
public class BackController {

    @Autowired
    private BackService service;

    /**
     * 首页
     *
     * @return
     */
    @GetMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("Journals", service.queryJournal());
        return "index";
    }


    @PostMapping(value = "/add")
    public String addJournal(@ModelAttribute JournalDO journalDO) {

        Journal journal = new Journal();
        journal.setTitle(journalDO.getTitle());
        try {
            journal.setImage_url(FastDFSClient.saveFile(journalDO.getFiles()[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (MultipartFile file : journalDO.getFiles()) {
            log.info(file.getName() + "<<-------------------<<");
        }
        journal.setPeriodical(journalDO.getPeriodical());
        journal.setIntro(journalDO.getIntro());
        journal.setTime(Calendar.getInstance().getTimeInMillis());
        service.addJounal(journal);
        return "redirect:/index";
    }

    @GetMapping(value = "/delete")
    public String deleteJournal(String id, String image_url) {
        log.info("------------------->id" + id + "------------url" + image_url);

        return "redirect:/index";
    }
}
