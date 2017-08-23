package service;

import dao.AdminStudentDao;
import entity.Studentinformation;

import java.util.List;

/**
 * Created by ${guhao} on 2017/8/15.
 */
public class AdminStudentService {
    public List<Studentinformation> AdminQueryStudentInfoService(){
        AdminStudentDao adminStudentDao =new AdminStudentDao();
        return  adminStudentDao.AdminQueryStudentInfoDao();
    }
}
