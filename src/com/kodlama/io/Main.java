package com.kodlama.io;

import com.kodlama.io.business.CategoryManager;
import com.kodlama.io.business.CourseManager;
import com.kodlama.io.business.TrainerManager;
import com.kodlama.io.core.DatadogLogger;
import com.kodlama.io.core.FileLogger;
import com.kodlama.io.core.ILogger;
import com.kodlama.io.core.SplunkLogger;
import com.kodlama.io.dataAccess.hibernateDao.HibernateCourseDao;
import com.kodlama.io.dataAccess.jdbcDao.JdbcCategoryDao;
import com.kodlama.io.dataAccess.jdbcDao.JdbcTrainerDao;
import com.kodlama.io.entities.Category;
import com.kodlama.io.entities.Course;
import com.kodlama.io.entities.Trainer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        ILogger[] loggers = {new DatadogLogger(), new FileLogger(), new SplunkLogger()};


        Trainer trainer = new Trainer(1235354, "Engin", " Demir");
        TrainerManager trainerManager = new TrainerManager(new JdbcTrainerDao(), loggers);
        trainerManager.add(trainer);

        System.out.println("---------------------------------------------");

        Course course1 = new Course(1, "Java Course", 5000);
        Course course2 = new Course(2, "Java Course", 35000);
        Course course3 = new Course(3, "Java", 0);
        List<Course> courseList = new ArrayList<>();
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courseList);
        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);

        System.out.println("-----------------------------------------------");

        Category category1 = new Category(1, "Programming");
        Category category2 = new Category(2,"Programming");
        List<Category> categoryList = new ArrayList<>();
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categoryList);
        categoryManager.add(category1);
        categoryManager.add(category2);


    }
}
