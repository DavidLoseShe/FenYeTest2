package dao;

import entity.Studentinformation;
import org.hibernate.Session;
import org.hibernate.query.Query;
import unti.Main;

/**
 * Created by d on 2017/7/25.
 */
public class FlowerDao {
    public int flowerContent(String username){
        username =username.trim();
        System.out.println("++++++++++++++++++"+username);

        String hql="from Studentinformation where studentId=?1";
        Session session = Main.getSession();
        Query query = session.createQuery(hql);
        query.setParameter(1,username);
        Studentinformation studentinformation = (Studentinformation) query.list().get(0);
        int flowers =studentinformation.getStudentflower();
        if(flowers>0){ flowers=flowers-1; studentinformation.setStudentflower(flowers);}
        else  flowers=-1;
        session.beginTransaction();
        session.update(studentinformation);
        session.getTransaction().commit();
       return  flowers;
    }
    public boolean flowerSong(String u){
        String hql="from Studentinformation where studentId=?1";
        Session session = Main.getSession();
        Query query = session.createQuery(hql);
        query.setParameter(1,u);
        Studentinformation studentinformation = (Studentinformation) query.list().get(0);
        studentinformation.setStudentflower(studentinformation.getStudentflower()+1);
        session.beginTransaction();
        session.update(studentinformation);
        session.getTransaction().commit();
      return true;
    }

}
