package com.shiyan.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
@Getter
@Setter
public class UserMoodPraiseRel {
    private int id;
    private int userId;
    private int moodId;
}
