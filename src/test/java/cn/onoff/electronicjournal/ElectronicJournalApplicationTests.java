package cn.onoff.electronicjournal;

import cn.onoff.electronicjournal.utils.FastDFSClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElectronicJournalApplicationTests {

    @Test
    void contextLoads() {
        try {
            FastDFSClient.deleteFile("group1", "wKifgV7jYpKAcpPNAAEI0kqu3js841.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
