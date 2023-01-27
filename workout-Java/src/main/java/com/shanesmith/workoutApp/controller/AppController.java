package com.shanesmith.workoutApp.controller;

import com.shanesmith.workoutApp.dao.ExerciseDao;
import com.shanesmith.workoutApp.dao.HistoryDao;
import com.shanesmith.workoutApp.dao.UserDao;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("isAuthenticated")
public class AppController {

    private final UserDao userDao;
    private final HistoryDao historyDao;
    private final ExerciseDao exerciseDao;

    public AppController(UserDao userDao, HistoryDao historyDao, ExerciseDao exerciseDao) {
        this.userDao = userDao;
        this.historyDao = historyDao;
        this.exerciseDao = exerciseDao;
    }
/*
    @GetMapping(path = "/history/{id}")
    public historyDto[] getHistory(Principal principal) {
        historyDto[] displayHistory = null;
        return displayHistory;
    }

 */
}
