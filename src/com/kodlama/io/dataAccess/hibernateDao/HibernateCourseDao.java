package com.kodlama.io.dataAccess.hibernateDao;

import com.kodlama.io.dataAccess.interfaceDao.ICourseDao;
import com.kodlama.io.entities.Course;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " is added in Hibernate");
    }
}
