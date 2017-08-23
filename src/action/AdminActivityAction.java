package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.ActivityInformation;
import service.AdminActivityService;

import java.util.List;

/**
 * Created by ${guhao} on 2017/8/15.
 */
public class AdminActivityAction extends ActionSupport{
    List<ActivityInformation> activityInformationList;

    public List<ActivityInformation> getActivityInformationList() {
        return activityInformationList;
    }

    public void setActivityInformationList(List<ActivityInformation> activityInformationList) {
        this.activityInformationList = activityInformationList;
    }

    public String AdminQueryActivityInfoAction(){
        AdminActivityService adminActivityService = new AdminActivityService();
        activityInformationList= adminActivityService.AdminQueryActivityInfoService();
        return "success";
    }
}
