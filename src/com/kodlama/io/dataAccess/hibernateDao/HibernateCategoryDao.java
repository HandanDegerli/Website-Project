package com.kodlama.io.dataAccess.hibernateDao;

import com.kodlama.io.dataAccess.interfaceDao.ICategoryDao;
import com.kodlama.io.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println( category.getId() + " is added in Hibernate");
    }
}
