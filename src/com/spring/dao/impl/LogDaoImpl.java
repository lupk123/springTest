package com.spring.dao.impl;

import com.spring.dao.LogDao;
import com.spring.model.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/8/15.
 */
@Repository("l")
public class LogDaoImpl implements LogDao{
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void add(Log log) {
        hibernateTemplate.save(log);
    }
}
