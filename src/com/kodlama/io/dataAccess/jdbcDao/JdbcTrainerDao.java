package com.kodlama.io.dataAccess.jdbcDao;

import com.kodlama.io.dataAccess.interfaceDao.ITrainerDao;
import com.kodlama.io.entities.Trainer;

public class JdbcTrainerDao implements ITrainerDao {
    @Override
    public void add(Trainer trainer) {
        System.out.println( trainer.getName() + trainer.getLastName() + " is added in JDBC");
    }
}
