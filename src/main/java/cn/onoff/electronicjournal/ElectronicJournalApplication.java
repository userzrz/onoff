package cn.onoff.electronicjournal;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@Slf4j
@MapperScan("cn.onoff.electronicjournal.mapper")
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class ElectronicJournalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicJournalApplication.class, args);
        log.info("启动成功————————————");
    }

}
