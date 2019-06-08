package com.shiyan.service;

import com.shiyan.dto.MoodDTO;
import com.shiyan.model.Mood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
public interface MoodService {
    List<MoodDTO> findAll();
    boolean praiseMood(int userId, int moodId);
    boolean update(@Param("mood") Mood mood);
    Mood findById(int id);
}
