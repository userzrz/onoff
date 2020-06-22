package cn.onoff.electronicjournal.controller;

import cn.onoff.electronicjournal.model.VO.JournalVO;
import cn.onoff.electronicjournal.model.Journal;
import cn.onoff.electronicjournal.service.BackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

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
    public String addJournal(@ModelAttribute JournalVO journalVO) {
        Journal journal = new Journal(journalVO.getTitle(), journalVO.getPeriodical(), Calendar.getInstance().getTimeInMillis(), journalVO.getIntro());
        service.addJounal(journal, journalVO.getFiles());
        return "redirect:/index";
    }

    @PostMapping(value = "/a")
    public String add(MultipartFile[] file) {
        for (MultipartFile f : file) {
            log.info(f.getOriginalFilename() + "<<-------------------<<");
        }
        return "";
    }

    @GetMapping(value = "/test")
    public String test() {
        return "test";
    }

    @GetMapping(value = "/delete")
    public String deleteJournal(String id) {
        service.deleteJounal(id);
        return "redirect:/index";
    }
}
