package com.aditya.listeners;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class FirstJobListeners implements JobExecutionListener {


    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Before Job "+ jobExecution.getJobInstance().getJobName());
        System.out.println(" Job Params "+jobExecution.getJobParameters());
        System.out.println(" Job Exe Context "+jobExecution.getExecutionContext());
        jobExecution.getExecutionContext().put("name", "aditya pathak");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("After Job "+ jobExecution.getJobInstance().getJobName());
        System.out.println(" Job Params "+jobExecution.getJobParameters());
        System.out.println(" Job Exe Context "+jobExecution.getExecutionContext());
    }
}
