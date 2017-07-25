package dao;

import entity.Studentinformation;
import org.hibernate.Session;
import org.hibernate.query.Query;
import unti.Main;

import java.util.List;


/**
 * Created by d on 2017/7/24.
 */
public class LoginDao {
    public Studentinformation Student(String username){
        String hql="from Studentinformation where studentId=?1";
        Session session= Main.getSession();
        Query query =session.createQuery(hql);
        query.setParameter(1,username);
        List<Studentinformation> list=query.list();
        Studentinformation student =null;
        for(Studentinformation studentinformation:list){
            student =studentinformation;
        }
     return student;
    }
}
