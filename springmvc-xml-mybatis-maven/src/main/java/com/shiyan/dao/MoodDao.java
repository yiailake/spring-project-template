package com.shiyan.dao;

import com.shiyan.model.Mood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
public interface MoodDao {
    List<Mood> findAll();
    boolean update(@Param("mood") Mood mood);
    Mood findById(int id);
}
