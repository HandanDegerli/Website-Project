package com.kodlama.io.core;

public class FileLogger implements ILogger {
    @Override
    public void log (String data) {
        System.out.println( data +" is logged in File");
    }
}
