package com.kodlama.io.dataAccess.jdbcDao;

import com.kodlama.io.dataAccess.interfaceDao.ICategoryDao;
import com.kodlama.io.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println( category.getCategoryName() + " is added in JDBC");
    }
}
