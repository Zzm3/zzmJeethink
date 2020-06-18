package com.jeethink.common.utils.job;

import org.quartz.JobExecutionContext;

import com.jeethink.project.monitor.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 * 
 * @author jeethink  官方网址：www.jeethink.vip
 *
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
