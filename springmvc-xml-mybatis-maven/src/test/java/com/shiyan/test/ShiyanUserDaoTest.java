package com.shiyan.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shiyan.dao.UserDao;
import com.shiyan.model.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kevinfeng
 * @date 2019-05-26
 */
public class ShiyanUserDaoTest extends BaseJunit4Test {
    @Resource
    private UserDao userDao;

    @Test
    public void testFindAll() {
        List<User> userList = userDao.findAll();
        System.out.println(userList.size());
    }

    @Test
    public void testPageHelper() {
        PageHelper.startPage(0, 1);
        List<User> userList = userDao.findAll();
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        System.out.println(pageInfo);
    }
}
