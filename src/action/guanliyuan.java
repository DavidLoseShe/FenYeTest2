package action;

import entity.ActivityInformation;
import service.ActivityService;

import java.util.List;

/**
 * Created by ${guhao} on 2017/7/27.
 */
public class guanliyuan {

    List<ActivityInformation> rows;

    public List<ActivityInformation> getRows() {
        return rows;
    }

    public void setRows(List<ActivityInformation> rows) {
        this.rows = rows;
    }

    public  String guanliyuan(){
         ActivityService activityService = new ActivityService();
         rows= activityService.activityInformationList(1,"所有","正在发布","所有","admin");
         return "success";
     }
}
