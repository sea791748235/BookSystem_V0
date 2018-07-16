/**
 * FileName:    UserService
 * Author:      sealllsea
 * Date:        2018/7/4 15:48
 * Description:
 */
package com.hisen.service;

import com.hisen.entity.Book;
import com.hisen.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    boolean login(String username, String password);
    User queryUser(String username,String password);
    User getById(int id);
    List<User> getList(int start, int pageNum);
    int addUser(User user);
    int updateUser(User user);
    int deleteUserById(int id);
}
