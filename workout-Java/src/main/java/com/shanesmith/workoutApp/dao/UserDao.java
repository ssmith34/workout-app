package com.shanesmith.workoutApp.dao;

import com.shanesmith.workoutApp.model.User;
import com.shanesmith.workoutApp.model.UserListDto;
import java.util.List;

public interface UserDao {
    List<UserListDto> findAll();
    User findByUsername(String username);
    int findIdByUsername(String username);
    boolean create(String username, String password);
}