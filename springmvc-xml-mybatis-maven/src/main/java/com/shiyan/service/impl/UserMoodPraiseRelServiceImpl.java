package com.shiyan.service.impl;

import com.shiyan.dao.UserMoodPraiseRelDao;
import com.shiyan.model.UserMoodPraiseRel;
import com.shiyan.service.UserMoodPraiseRelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
@Service
public class UserMoodPraiseRelServiceImpl implements UserMoodPraiseRelService {

    @Resource
    private UserMoodPraiseRelDao userMoodPraiseRelDao;

    @Override
    public boolean save(UserMoodPraiseRel userMoodPraiseRel) {
        return userMoodPraiseRelDao.save(userMoodPraiseRel);
    }
}
