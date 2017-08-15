package dao;

import entity.MessageInformation;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import unti.Main;

import java.util.List;

/**
 * Created by ${guhao} on 2017/8/14.
 */
public class MessageDao {
    public int MessageContentDao(String studentId){
        int MessageContent;
        String hql="select count(*) from MessageInformation where messageState='未读' and messageReceiveId=?1";
        Session session = Main.getSession();
        Query query = session.createQuery(hql);
       query.setParameter(1,studentId);
        Long aLong=(Long)query.uniqueResult();
        MessageContent=aLong.intValue();
        return MessageContent;
    }
    public List<MessageInformation> Message(String studentId){
        String hql="from MessageInformation where messageState='未读' and messageReceiveId=?1";
        Session session = Main.getSession();
        Query query = session.createQuery(hql);
        query.setParameter(1,studentId);
        List<MessageInformation> messageInformationList=query.list();
        return messageInformationList;
    }
    public boolean ModifyMessageStateDao(int messageId) {
        Session session = Main.getSession();
        MessageInformation messageInformation = session.get(MessageInformation.class, messageId);
        messageInformation.setMessageState("已读");
        Transaction trans = session.beginTransaction();
        session.update(messageInformation);
        trans.commit();
        return true;
    }
}
