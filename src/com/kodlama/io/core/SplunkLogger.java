package com.kodlama.io.core;

import com.kodlama.io.core.ILogger;

public class SplunkLogger implements ILogger {
    @Override
    public void log (String data) {
        System.out.println( data +" is logged in Splunk");
    }
}
