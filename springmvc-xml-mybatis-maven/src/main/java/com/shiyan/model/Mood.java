package com.shiyan.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
@Getter
@Setter
public class Mood {
    private int id;
    private String content;
    private int praiseNum;
    private int userId;
    private Date publishTime;
}
