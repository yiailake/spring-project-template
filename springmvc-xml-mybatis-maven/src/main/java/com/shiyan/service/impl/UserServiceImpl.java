package com.shiyan.service.impl;

import com.shiyan.dao.UserDao;
import com.shiyan.dto.UserDTO;
import com.shiyan.model.User;
import com.shiyan.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserDTO find(int id) {
        User user = userDao.findById(id);
        return convertModel2DTO(user);
    }

    private UserDTO convertModel2DTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setAccount(user.getAccount());
        return userDTO;
    }
}
