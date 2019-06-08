package com.shiyan.service.impl;

import com.shiyan.dao.MoodDao;
import com.shiyan.dao.UserDao;
import com.shiyan.dao.UserMoodPraiseRelDao;
import com.shiyan.dto.MoodDTO;
import com.shiyan.model.Mood;
import com.shiyan.model.User;
import com.shiyan.model.UserMoodPraiseRel;
import com.shiyan.service.MoodService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
@Service
public class MoodServiceImpl implements MoodService {

    @Resource
    private MoodDao moodDao;

    @Resource
    private UserDao userDao;

    @Resource
    private UserMoodPraiseRelDao userMoodPraiseRelDao;

    @Override
    public List<MoodDTO> findAll() {
        List<Mood> moodList = moodDao.findAll();
        return convertMode2DTO(moodList);
    }

    @Override
    public boolean praiseMood(int userId, int moodId) {
        // 保存关联关系
        UserMoodPraiseRel userMoodPraiseRel = new UserMoodPraiseRel();
        userMoodPraiseRel.setUserId(userId);
        userMoodPraiseRel.setMoodId(moodId);
        userMoodPraiseRelDao.save(userMoodPraiseRel);

        // 更新说说的点赞数量
        Mood mood = this.findById(moodId);
        mood.setPraiseNum(mood.getPraiseNum() + 1);
        this.update(mood);

        return true;
    }

    @Override
    public boolean update(Mood mood) {
        return moodDao.update(mood);
    }

    @Override
    public Mood findById(int id) {
        return moodDao.findById(id);
    }

    private List<MoodDTO> convertMode2DTO(List<Mood> moodList) {
        if (CollectionUtils.isEmpty(moodList)) return Collections.emptyList();
        List<MoodDTO> moodDTOList = new ArrayList<>();
        for (Mood mood : moodList) {
            MoodDTO moodDTO = new MoodDTO();
            moodDTO.setId(mood.getId());
            moodDTO.setContent(mood.getContent());
            moodDTO.setPraiseNum(mood.getPraiseNum());
            moodDTO.setPublishTime(mood.getPublishTime());
            moodDTO.setUserId(mood.getUserId());
            // 设置用户信息
            User user = userDao.findById(mood.getUserId());
            moodDTO.setUserName(user.getName());
            moodDTO.setUserAccount(user.getAccount());

            moodDTOList.add(moodDTO);
        }
        return moodDTOList;
    }
}
