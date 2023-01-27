package com.shanesmith.workoutApp.dao;

public interface UserDao {
    boolean create(String username, String password);
}
