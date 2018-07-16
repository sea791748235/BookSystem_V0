/**
 * FileName:    UserServiceImpl
 * Author:      sealllsea
 * Date:        2018/7/4 15:39
 * Description:
 */
package com.hisen.service.impl;

import com.hisen.dao.UserDao;
import com.hisen.entity.User;
import com.hisen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean login(String username,String password){
        User user=userDao.queryUser(username, password);
        if(user!=null){
            return true;
        }
        return false;
    }
    @Override
    public User queryUser(String username,String password){
        return userDao.queryUser(username,password);
    }
    @Override
    public User getById(int id) {
        return userDao.queryById(id);
    }

    @Override
    public List<User> getList(int start, int pageNum) {
        return userDao.queryAll(start, pageNum);
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }
}
