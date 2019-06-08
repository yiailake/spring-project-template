package com.shiyan.dto;

import com.shiyan.model.Mood;
import lombok.Getter;
import lombok.Setter;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
@Getter
@Setter
public class MoodDTO extends Mood {
    private String userName;
    private String userAccount;
}
