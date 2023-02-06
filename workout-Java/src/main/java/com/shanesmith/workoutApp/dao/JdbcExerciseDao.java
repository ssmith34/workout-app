package com.shanesmith.workoutApp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcExerciseDao implements ExerciseDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcExerciseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
