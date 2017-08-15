package unti;

import dao.ActivityDao;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ${guhao} on 2017/8/15.
 */
public class QuartzJobOperate {
    public void StartPark(String job_name){
            try {
                ActivityDao activityDao = new ActivityDao();
                Date date=activityDao.QueryActivityTime(Integer.parseInt(job_name));
                System.out.print(getCron(date));
                QuartzManager.addJob(job_name, QuartzJob.class, getCron(date));
                // QuartzManager.addJob(job_name, QuartzJob.class, "0/2 * * * * ?");
                //  QuartzManager.addJob(job_name, QuartzJob.class, "0 36 11 26 7 ? 2017");
            }
            catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    public  String formatDateByPattern(Date date, String dateFormat){
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String formatTimeStr = null;
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }
    public  String getCron(java.util.Date  date){
        String dateFormat="ss mm HH dd MM ? yyyy";
        return formatDateByPattern(date, dateFormat);
    }
  public void  remove(String job_name ){
      QuartzManager.removeJob(job_name);
  }

}
