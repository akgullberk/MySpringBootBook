package com.akgulberk.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {

    @Scheduled(cron = "0 51 09 * * *")
    public void write1To10(){
        for(int i=0;i<10;i++){
            System.out.println(i+" ");
        }
    }


}
