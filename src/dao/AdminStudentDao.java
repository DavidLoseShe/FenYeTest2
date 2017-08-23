package dao;

import entity.Studentinformation;
import org.hibernate.Session;
import org.hibernate.query.Query;
import unti.Main;

import java.util.List;

/**
 * Created by ${guhao} on 2017/8/15.
 */
public class AdminStudentDao {
    public List<Studentinformation> AdminQueryStudentInfoDao(){
        Session session = Main.getSession();
        String hql="from Studentinformation ";
        Query query =session.createQuery(hql);
        List<Studentinformation> activityInformationList=query.list();
        return activityInformationList;
    }
}
