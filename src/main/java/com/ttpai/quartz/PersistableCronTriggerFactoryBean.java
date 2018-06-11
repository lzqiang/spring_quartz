package com.ttpai.quartz;

import org.springframework.scheduling.quartz.CronTriggerFactoryBean;

public class PersistableCronTriggerFactoryBean extends CronTriggerFactoryBean{
    /*@Override
    public void afterPropertiesSet() {
        super.afterPropertiesSet();
        System.out.println("PersistableCronTriggerFactoryBean-------------------");
         // Remove the JobDetail element
         getJobDataMap().remove(JobDetailAwareTrigger.JOB_DETAIL_KEY);
    }*/
}
