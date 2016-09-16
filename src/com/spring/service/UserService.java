package com.spring.service;


import com.spring.dao.LogDao;
import com.spring.dao.UserDao;
import com.spring.model.Log;
import com.spring.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/8/10.
 */
@Service("userService")
public class UserService {
    private UserDao userDao;
    private LogDao logDao;

    public LogDao getLogDao() {
        return logDao;
    }

    @Resource(name = "l")
    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Resource(name="u")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void add(User  u, Log log){
        userDao.add(u);
        logDao.add(log);
    }
}
