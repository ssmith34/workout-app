package com.shanesmith.workoutApp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcHistoryDao implements HistoryDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcHistoryDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
