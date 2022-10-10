package com.kodlama.io.business;

import com.kodlama.io.core.ILogger;
import com.kodlama.io.dataAccess.interfaceDao.ICourseDao;
import com.kodlama.io.entities.Course;
import java.util.List;

public class CourseManager {
    private ICourseDao courseDao;
    private ILogger[] loggers;
    private List<Course> courses;

    public CourseManager(ICourseDao courseDao, ILogger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception{

        if( course.getPrice() <= 0 ){
            throw new Exception("The course's Price can not be equal 0 and low than 0!!!!");
        }

        for (Course crs: courses ){
            if (crs.getCourseName() == course.getCourseName()){
                try {
                    throw new Exception("Course name can not repeat, change the course name please!");
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                }}
        }

        courseDao.add(course);
        courses.add(course);

        for (ILogger logger: loggers){
            logger.log(Double.toString(course.getPrice()));
        }


    }
}
