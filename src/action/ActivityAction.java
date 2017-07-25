package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.ActivityInformation;
import entity.Remarkinformation;
import entity.Studentinformation;
import service.ActivityService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by d on 2017/7/13.
 */
public class ActivityAction extends ActionSupport{
        int page;
        int pageNo=1;
        String activityType;
        ActivityInformation activityInformation;
        int activityId;
        List<Remarkinformation> remarkinformationList;
        List<ActivityInformation> activityInformations;
        String remarkContent;
        Studentinformation remarkPeople;



    public String getRemarkContent() {
        return remarkContent;
    }

    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent;
    }

    public Studentinformation getRemarkPeople() {
        return remarkPeople;
    }

    public void setRemarkPeople(Studentinformation remarkPeople) {
        this.remarkPeople = remarkPeople;
    }

    public List<Remarkinformation> getRemarkinformationList() {
        return remarkinformationList;
    }

    public void setRemarkinformationList(List<Remarkinformation> remarkinformationList) {
        this.remarkinformationList = remarkinformationList;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public ActivityInformation getActivityInformation() {
        return activityInformation;
    }

    public void setActivityInformation(ActivityInformation activityInformation) {
        this.activityInformation = activityInformation;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }




       public void setPage(int page) {
              this.page = page;
       }

       public int getPageNo() {
              return pageNo;
       }

       public void setPageNo(int pageNo) {
              this.pageNo = pageNo;
       }

       public List<ActivityInformation> getActivityInformations() {
              return activityInformations;
       }

       public void setActivityInformations(List<ActivityInformation> activityInformations) {
              this.activityInformations = activityInformations;
       }

       public int getPage() {
              return page;
       }
       public String informationList(){
              ActivityService  activityService = new ActivityService();
               page= activityService.getPage(  activityType);
              activityInformations=activityService.activityInformationList(pageNo,activityType);
              for (ActivityInformation activityInformation:activityInformations){
                     System.out.print(activityInformation.getActivityId());
              }
              return "success";
       }
    public String Join() {
           ActionContext actionContext = ActionContext.getContext();
           Map session = actionContext.getSession();
        remarkPeople= (Studentinformation) session.get("AcUser");
           if (remarkPeople != null) {
                   //1
                   //2
                  ActivityService activityService = new ActivityService();
                   activityInformation=activityService.activityInformation(activityId);
                   System.out.print(activityId);
                   return "success";

           }
           else {System.out.println("2222222222"); return "wrong";}

       }
       public String remark(){
              ActivityService activityService = new ActivityService();
              remarkinformationList=activityService.remarkinformationList(activityId);
              return "success";
       }
       public String remarkSave(){
           ActionContext actionContext = ActionContext.getContext();
           Map session = actionContext.getSession();
           remarkPeople= (Studentinformation) session.get("AcUser");
           SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           Remarkinformation remarkinformation = new Remarkinformation();
           remarkinformation.setRemarkContent(remarkContent);
           remarkinformation.setActivityId(activityId);
           remarkinformation.setStudentId(remarkPeople.getStudentName());
           remarkinformation.setRemarkTime(df.format(new Date()));
           ActivityService activityService = new ActivityService();
           if(activityService.remarkSave(remarkinformation))
           return "success";
           else { return  "wrong";}

       }
}

