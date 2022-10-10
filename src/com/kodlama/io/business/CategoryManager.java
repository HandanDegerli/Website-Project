package com.kodlama.io.business;


import com.kodlama.io.core.ILogger;
import com.kodlama.io.dataAccess.interfaceDao.ICategoryDao;
import com.kodlama.io.entities.Category;

import java.util.List;

public class CategoryManager {
    private final ICategoryDao categoryDao;
    private final ILogger[] loggers;
    private final List<Category> categories;

    public CategoryManager( ICategoryDao categoryDao, ILogger[] loggers, List<Category> categories){
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public  void add(Category category) throws Exception{

        for(Category ctgry:categories){
            if (ctgry.getCategoryName() == category.getCategoryName()){
                   throw new Exception("Category name can not repeat, change the category name please!");
            }
        }

        categoryDao.add(category);
        categories.add(category);

        for (ILogger logger : loggers){
            logger.log(category.getCategoryName());
        }
    }
}
