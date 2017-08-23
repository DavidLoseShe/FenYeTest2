package dao;

import entity.Studentinformation;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import unti.Main;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public  boolean SaveLoginTime(String studentId){
        Session session = Main.getSession();
        Studentinformation studentinformation =session.get(Studentinformation.class,studentId);
        studentinformation.setStudentLoginTime(Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));
        Transaction trans = session.beginTransaction();
        session.update(studentinformation);
        trans.commit();
        return  true;
    }
}
