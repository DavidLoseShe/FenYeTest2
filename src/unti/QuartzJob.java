package unti;

/**
 * Created by ${guhao} on 2017/7/26.
 */
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 任务执行类
 */
public class QuartzJob implements Job {

    @Override
    public void execute(JobExecutionContext content) throws JobExecutionException {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+ "★★★★★★★★★★★");
        String jobName = content.getJobDetail().getName();
        JobDataMap dataMap = content.getJobDetail().getJobDataMap();
        String param = dataMap.getString("param");
        System.out.println("传递的参数是="+param +"      "+jobName);
    }
}