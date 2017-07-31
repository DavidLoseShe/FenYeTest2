package unti;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ${guhao} on 2017/7/26.
 */
public class QuartzTest {

    //Test   Quartz
    public static void main(String arg[]){
       try {
        String job_name = "加载中……";
        System.out.println("【任务启动】开始(每2秒输出一次)...");
           QuartzManager.addJob(job_name, QuartzJob.class, "0/2 * * * * ?");
      //  QuartzManager.addJob(job_name, QuartzJob.class, "0 36 11 26 7 ? 2017");
    }
       catch (Exception e) {
        System.out.println(e.toString());
    }
    }
    public static String formatDateByPattern(Date date, String dateFormat){
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String formatTimeStr = null;
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }
    public static String getCron(java.util.Date  date){
        String dateFormat="ss mm HH dd MM ? yyyy";
        return formatDateByPattern(date, dateFormat);
    }

}
