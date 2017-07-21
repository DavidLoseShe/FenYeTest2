package dao;

import entity.ActivityInformation;
import entity.Remarkinformation;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import unti.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by d on 2017/7/12.
 */
public class ActivityDao {
    public int getPage( String activityType){
        int recordCount=0,t1=0,t2=0;
        Session session= Main.getSession();
        String hql1="select count(*) from ActivityInformation where activityKind =?1 or '所有'=?1";
        Query query=session.createQuery(hql1);
        query.setParameter(1, activityType);

       Long aLong=(Long)query.uniqueResult();

       recordCount=aLong.intValue();

        t1=recordCount%6;
        t2=recordCount/6;
        if(t1 != 0){
            t2=t2+1;
        }

        return t2;
    }
    /**
     * 查询指定页的数据
     * @param pageNo
     * @return
     */
    public List<ActivityInformation> listUser(int pageNo,String activityType){

        List<ActivityInformation> list=new ArrayList<ActivityInformation>();
        int pageSize=6;
        int page=(pageNo-1)*6;
        Session session= Main.getSession();
        String hql2="from ActivityInformation where activityKind =?1 or '所有'=?1";
        Query query=session.createQuery(hql2);
        query.setParameter(1,activityType);
        query.setFirstResult(page);
        query.setMaxResults(pageSize);
        list=query.list();
        System.out.println(activityType);
        for (ActivityInformation activityInformation:list){
            System.out.print(activityInformation.getActivityId());
        }
        return list;
    }
    public ActivityInformation activityInformation(int id){
        ActivityInformation activityInformation=null;
        String  hql3="from ActivityInformation where activityId=?1";
        Session session= Main.getSession();
        Query query=session.createQuery(hql3);
        query.setParameter(1,id) ;
        if(query.list().size()>0)
        activityInformation= (ActivityInformation) query.list().get(0);
        return activityInformation;
    }
     public List<Remarkinformation> remarkinformationList(int id){
        List<Remarkinformation> remarkinformationeList =null;
         String  hql4="from Remarkinformation where activityId=?1";
         Session session= Main.getSession();
         Query query=session.createQuery(hql4);
         query.setParameter(1,id) ;
         remarkinformationeList =query.list();
         return remarkinformationeList;
     }
     public Boolean remarkSave(Remarkinformation remarkinformation){
           Session session = Main.getSession();
         Transaction  tx=session.beginTransaction();
         if(session.save(remarkinformation).toString()!=null){
             tx.commit();
             session.close();

               return true;
           }
           System.out .print("shibai");
           return false;
     }
}

