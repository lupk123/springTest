package com.spring.dao.impl;

import com.spring.dao.UserDao;
import com.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/8/10.
 */
@Repository("u")
public class UserDaoImpl implements UserDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void add(User u) {
        hibernateTemplate.save(u);
        System.out.print("User saved");
    }
}
