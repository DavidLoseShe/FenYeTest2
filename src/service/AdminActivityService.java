package service;

import dao.AdminActivityDao;
import entity.ActivityInformation;

import java.util.List;

/**
 * Created by ${guhao} on 2017/8/15.
 */
public class AdminActivityService {
    public List<ActivityInformation> AdminQueryActivityInfoService(){
        AdminActivityDao adminActivityDao = new AdminActivityDao();
        return  adminActivityDao.AdminQueryActivityInfoDao();
    }
}
