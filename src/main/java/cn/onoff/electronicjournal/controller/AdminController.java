package cn.onoff.electronicjournal.controller;

import cn.onoff.electronicjournal.model.Admin;
import cn.onoff.electronicjournal.model.VO.JournalVO;
import cn.onoff.electronicjournal.service.AdminService;
import cn.onoff.electronicjournal.utils.CommonUtils;
import cn.onoff.electronicjournal.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/10 13:27
 * @VERSION 1.0
 **/
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;


    @GetMapping(value = {"/", "login"})
    public String login(HttpSession session) {
        if (session.getAttribute(CommonUtils.ADMIN_SESSION) != null) {
            return "redirect:/index";
        }
        return "login";
    }

    /**
     * 新增页面
     *
     * @return
     */
    @GetMapping(value = "/redact")
    public String redact(Model model) {
        model.addAttribute("data", new JournalVO());
        return "redact";
    }

    @PostMapping(value = "/log")
    public String login(@ModelAttribute Admin admin, HttpSession session, HttpServletResponse response, Model model) {
        if (StringUtils.isEmpty(admin.getAccount())
                || StringUtils.isEmpty(admin.getPassword())) {
            model.addAttribute("msg", "用户名或密码不能为空");
            return "login";
        }
        String pwd = MD5Utils.MD5Encode(admin.getPassword(), "utf8");
        admin = adminService.getAdmin(admin.getAccount(), pwd);
        if (admin != null) {
            session.setAttribute(CommonUtils.ADMIN_SESSION, admin);
            return "redirect:/index";
        } else {
            model.addAttribute("msg", "账号或密码错误");
            return "login";
        }
    }


    @GetMapping(value = "/exit")
    public String exit(HttpSession session) {
        session.invalidate();
        return "login";
    }


}
