package com.spring.orm.dao;

import com.spring.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    //Save student details.
    public Integer insert(Student student) {

        //Insert operation here.
        Integer i = (Integer) this.hibernateTemplate.save(student);
        return i;
    }

}
