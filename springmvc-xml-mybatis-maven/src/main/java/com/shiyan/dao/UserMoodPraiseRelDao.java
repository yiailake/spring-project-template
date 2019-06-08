package com.shiyan.dao;

import com.shiyan.model.UserMoodPraiseRel;
import org.apache.ibatis.annotations.Param;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
public interface UserMoodPraiseRelDao {
    boolean save(@Param("userMoodPraiseRel") UserMoodPraiseRel userMoodPraiseRel);
}
