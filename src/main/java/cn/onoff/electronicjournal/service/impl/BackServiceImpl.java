package cn.onoff.electronicjournal.service.impl;

import cn.onoff.electronicjournal.mapper.BackMapper;
import cn.onoff.electronicjournal.model.DO.JournalDO;
import cn.onoff.electronicjournal.model.DO.PictureDO;
import cn.onoff.electronicjournal.model.Journal;
import cn.onoff.electronicjournal.model.Picture;
import cn.onoff.electronicjournal.service.BackService;
import cn.onoff.electronicjournal.utils.FastDFSClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.StringUtils;

import java.io.IOException;
import java.util.List;

/**
 * @Description TODO
 * @Author ZHENG
 * @Data 2020/6/11 16:30
 * @VERSION 1.0
 **/
@Slf4j
@Service
public class BackServiceImpl implements BackService {

    @Autowired
    BackMapper backMapper;

    @Override
    public int addJounal(Journal journal, MultipartFile[] files) {
        int journalId = backMapper.addJounal(journal);
        if (journalId == 0) {
            return 0;
        }
        log.info(journal.getId() + "");
        for (MultipartFile file : files) {
            String[] fileAbsolutePath;
            try {
                fileAbsolutePath = FastDFSClient.saveFile(file);
                Picture picture = new Picture();
                picture.setGroupName(fileAbsolutePath[0]);
                picture.setRemoteFileName(fileAbsolutePath[1]);
                picture.setJournalId(journal.getId());
                picture.setImageUrl(FastDFSClient.getTrackerUrl() + fileAbsolutePath[0] + "/" + fileAbsolutePath[1]);
                String fileName = StringUtils.substringBefore(file.getOriginalFilename(), ".");
                if (fileName.equals("封面") ||
                        fileName.equals("封面图")) {
                    picture.setCover(1 + "");
                } else {
                    picture.setCover(0 + "");
                }
                if (backMapper.addPicture(picture) == 0) {
                    return 0;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return 1;
    }

    @Override
    public List<JournalDO> queryJournal() {
        return backMapper.queryJournal();
    }

    @Override
    public void deleteAllPictureDO() {
        List<PictureDO> list = backMapper.queryAllPictureDO();
        for (PictureDO pictureDO : list) {
            try {
                FastDFSClient.deleteFile(pictureDO.getGroupName(), pictureDO.getRemoteFileName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int deleteJounal(String journalId) {
        List<PictureDO> list = backMapper.queryPictureDO(journalId);
        for (PictureDO pictureDO : list) {
            try {
                FastDFSClient.deleteFile(pictureDO.getGroupName(), pictureDO.getRemoteFileName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        backMapper.deletePicture(journalId);
        backMapper.deleteJournal(journalId);
        return 1;
    }

}
