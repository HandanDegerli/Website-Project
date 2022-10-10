package com.kodlama.io.business;

import com.kodlama.io.core.ILogger;
import com.kodlama.io.dataAccess.interfaceDao.ITrainerDao;
import com.kodlama.io.entities.Trainer;


public class TrainerManager {

        ITrainerDao trainerDao;
        ILogger[] loggers;

        public TrainerManager (ITrainerDao trainerDao, ILogger[] loggers){
            this.trainerDao = trainerDao;
            this.loggers = loggers;
        }

        public void add(Trainer trainer){

            trainerDao.add(trainer);

            for (ILogger logger: loggers){
                logger.log(String.valueOf(trainer.getId()));
            }
        }



}
