/**
 * FileName:    UserDaoTest
 * Author:      sealllsea
 * Date:        2018/7/4 16:22
 * Description:
 */
package com.hisen.test;

import com.hisen.dao.BookDao;
import com.hisen.dao.UserDao;
import com.hisen.entity.Book;
import com.hisen.entity.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDaoTest extends BaseTest{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Test
    public void addUser() {
        for (int i = 0; i < 10; i++) {
            User user =new User();
            user.setUsername("a"+i);
            user.setPassword("b"+i);
            user.setRole(i);
            int num=userDao.addUser(user);
            logger.debug("\n================\n"+"addUser"+"+++++++++++++++\n"+num+"===============\n");
        }
    }

    @Test
    public void queryById() {
        User user = userDao.queryById(1);
        System.out.println(user);
    }

    @Test
    public void queryAll() {
        List<User> users = userDao.queryAll(0, 1000);
//    System.out.println(books);
        logger.debug("\n================\n"+"this is logger:"+"+++++++++++++++\n"+users.toString()+"===============\n");
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(1);
        user.setUsername("aaa");
        user.setPassword("bbb");
        user.setRole(111);
        int num = userDao.updateUser(user);
        logger.debug("\n================\n"+"updateUser"+"+++++++++++++++\n"+num+"===============\n");
    }

    @Test
    public void deleteUserById() {
        userDao.deleteUserById(111);
    }
}
