package com.ttpai.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.beans.factory.annotation.Autowired;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution// 不允许并发执行
public class FirstScheduledJob implements Job{
	//QuartzJobBean
	/*@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("执行FirstScheduledJob");
		anotherBean.printAnotherMessage();
	}*/
	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
	    /*try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
        }*/
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String time = sdf.format(date);
		System.out.println(time+"执行FirstScheduledJob");
		//throw new JobExecutionException();
	}




}
