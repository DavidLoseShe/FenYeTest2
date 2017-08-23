package action;

import entity.Studentinformation;
import service.AdminStudentService;

import java.util.List;

/**
 * Created by ${guhao} on 2017/8/15.
 */
public class AdminStudentAction {
    List<Studentinformation> studentinformationList;

    public List<Studentinformation> getStudentinformationList() {
        return studentinformationList;
    }

    public void setStudentinformationList(List<Studentinformation> studentinformationList) {
        this.studentinformationList = studentinformationList;
    }

    public  String AdminQueryStudentInfoAction(){
        AdminStudentService adminStudentService =new AdminStudentService();
        studentinformationList=adminStudentService.AdminQueryStudentInfoService();
        return "success";
    }
}
