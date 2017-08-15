package service;

import dao.MessageDao;
import entity.MessageInformation;

import java.util.List;

/**
 * Created by ${guhao} on 2017/8/14.
 */
public class MessageService {
    public int MessageContentService(String studentId){
        MessageDao messageDao = new MessageDao();
        return  messageDao.MessageContentDao(studentId);
    }
    public List<MessageInformation> mssage(String studentId){
        MessageDao messageDao = new MessageDao();
        return  messageDao.Message(studentId);
    }
    public boolean ModifyMessageStateService(int messageId){
        MessageDao messageDao = new MessageDao();
        return  messageDao.ModifyMessageStateDao(messageId);
    }
}
