package unti;

/**
 * Created by ${guhao} on 2017/7/26.
 */
import dao.ActivityDao;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 任务执行类
 */
public class QuartzJob implements Job {

    @Override
    public void execute(JobExecutionContext content) throws JobExecutionException {
       // System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+ "★★★★★★★★★★★");
        int jobName = Integer.parseInt(content.getJobDetail().getName());
        JobDataMap dataMap = content.getJobDetail().getJobDataMap();
       // String param = dataMap.getString("param");
        ActivityDao activityDao = new ActivityDao();
       if( activityDao.ZidongModifyActivityState(jobName)){
           System.out.println("操作成功");
       }
     //   System.out.println("传递的参数是="+param +"      "+jobName);
    }
}