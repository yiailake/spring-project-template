package com.shiyan.service;

import com.shiyan.dto.UserDTO;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
public interface UserService {
    /**
     * 通过id查询用户
     * @param id
     * @return
     */
    UserDTO find(int id);
}
