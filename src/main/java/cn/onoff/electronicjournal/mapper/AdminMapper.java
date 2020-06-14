package cn.onoff.electronicjournal.mapper;

import cn.onoff.electronicjournal.model.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/10 12:51
 * @VERSION 1.0
 **/
public interface AdminMapper {

    /**
     * 验证用户信息
     *
     * @return
     */
    Admin getAdmin(@Param("a") String account, @Param("p") String passWord);
}
