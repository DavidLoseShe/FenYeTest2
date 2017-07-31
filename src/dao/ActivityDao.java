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
    public int getPage( String activityType,String activityState,String activityRelation,String peopleid){
        int recordCount=0,t1=0,t2=0;
        Session session= Main.getSession();
       Query query;
        String hql1="select count(*) from ActivityInformation where( activityKind =?1 or '所有'=?1)and activityState=?2" ;
        String hql2="select count(*) from ActivityInformation a,Joinactivity b where( a.activityKind =?1 or '所有'=?1)and a.activityState=?2 and  a.activityId=b.activityiid and b.peopleiid=?3 ";
        if(activityRelation.equals("所有")){
            query = session.createQuery(hql1);
            query.setParameter(1, activityType);
            query.setParameter(2, activityState);
        }
        else {
            query = session.createQuery(hql2);
            query.setParameter(1, activityType);
            query.setParameter(2, activityState);
            query.setParameter(3, peopleid);
        }
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
    public List<ActivityInformation> listUser(int pageNo,String activityType,String activityState,String activityRelation,String peopleid){
         List activityInformationList=new ArrayList<ActivityInformation>();
         List<Object[]> list;
        int pageSize=6;
        int page=(pageNo-1)*6;
        Session session= Main.getSession();
        Query query;
        String hql ="from ActivityInformation a  where( a.activityKind =?1 or '所有'=?1)and a.activityState=?2";
        String hql2=" from ActivityInformation a , Joinactivity b where( a.activityKind =?1 or '所有'=?1)and a.activityState=?2 and  a.activityId=b.activityiid and b.peopleiid=?3 ";
      if(activityRelation.equals("所有")){
          query = session.createQuery(hql);
          query.setParameter(1, activityType);
          query.setParameter(2, activityState);
          query.setFirstResult(page);
          query.setMaxResults(pageSize);
          activityInformationList=query.list();
      }
      else {
          query = session.createQuery(hql2);
          query.setParameter(1, activityType);
          query.setParameter(2, activityState);
          query.setParameter(3, peopleid);
          query.setFirstResult(page);
          query.setMaxResults(pageSize);
          list=query.list();
          for (Object[] objects :list){
              ActivityInformation activityInformation=null;
              activityInformation=(ActivityInformation)objects[0];
              activityInformationList.add(activityInformation);
          }

      }

          return activityInformationList;

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

