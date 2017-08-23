package dao;

import entity.ActivityInformation;
import org.hibernate.Session;
import org.hibernate.query.Query;
import unti.Main;

import java.util.List;

/**
 * Created by ${guhao} on 2017/8/15.
 */
public class AdminActivityDao {
    public List<ActivityInformation> AdminQueryActivityInfoDao(){
        Session session = Main.getSession();
        String hql="from ActivityInformation";
        Query query =session.createQuery(hql);
        List<ActivityInformation> activityInformationList=query.list();
        return activityInformationList;
    }
}
