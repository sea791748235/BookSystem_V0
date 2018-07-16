/**
 * FileName:    UserDao
 * Author:      sealllsea
 * Date:        2018/7/4 14:31
 * Description:
 */
package com.hisen.dao;
import com.hisen.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    User queryUser(@Param("username") String username,@Param("password") String password);
    User queryById(int Id);
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    int addUser(User user);
    int updateUser(User user);
    int deleteUserById(int id);
}
