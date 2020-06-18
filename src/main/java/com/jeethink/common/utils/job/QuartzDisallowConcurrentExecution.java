package com.jeethink.common.utils.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;

import com.jeethink.project.monitor.domain.SysJob;

/**
 * 定时任务处理（禁止并发执行）
 * 
 * @author jeethink  官方网址：www.jeethink.vip
 *
 */
@DisallowConcurrentExecution
public class QuartzDisallowConcurrentExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
