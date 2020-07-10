package cn.onoff.electronicjournal;

import cn.onoff.electronicjournal.utils.FastDFSClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElectronicJournalApplicationTests {

    //http://192.168.159.129:80/group1/M00/00/00/wKifgV7jYpKAcpPNAAEI0kqu3js841.jpg
    @Test
    void contextLoads() {
        try {
            FastDFSClient.deleteFile("group1", "M00/00/01/wKifgl78B7eANZXPAAFKptMo2LY037.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
