package service;

import dao.ActivityDao;
import entity.ActivityInformation;
import entity.Remarkinformation;

import java.util.List;

/**
 * Created by d on 2017/7/12.
 */
public class ActivityService {



    public int getPage(String   activityType){
        int page;
        ActivityDao activityDao =new ActivityDao();
        page=activityDao.getPage(  activityType);

        return  page;
    }
    public List<ActivityInformation> activityInformationList(int pageNo,String activityType){
        List<ActivityInformation> activityInformations;
        ActivityDao activityDao =new ActivityDao();
        System.out.print(activityType);
        activityInformations=activityDao.listUser(pageNo,activityType);
        return  activityInformations;
    }
    public ActivityInformation activityInformation(int id){
        ActivityInformation activityInformation=null;
        ActivityDao activityDao = new ActivityDao();
        activityInformation = activityDao.activityInformation(id);
        return activityInformation;
    }
    public List<Remarkinformation> remarkinformationList(int id){
       ActivityDao activityDao = new ActivityDao();
       List<Remarkinformation> remarkinformationList=activityDao.remarkinformationList(id);
       return remarkinformationList;
    }
    public  Boolean remarkSave(Remarkinformation remarkinformation){
        ActivityDao activityDao = new ActivityDao();
        if (activityDao.remarkSave(remarkinformation))
            return true;
        else return  false;
    }
}
