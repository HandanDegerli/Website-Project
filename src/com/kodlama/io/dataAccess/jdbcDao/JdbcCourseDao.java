package com.kodlama.io.dataAccess.jdbcDao;

import com.kodlama.io.dataAccess.interfaceDao.ICourseDao;
import com.kodlama.io.entities.Course;

public class JdbcCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println( course.getId() + " is added in JDBC");
    }
}
