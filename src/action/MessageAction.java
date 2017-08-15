package action;

import com.opensymphony.xwork2.ActionContext;
import entity.MessageInformation;
import entity.Studentinformation;
import service.MessageService;

import java.util.List;
import java.util.Map;

/**
 * Created by ${guhao} on 2017/8/14.
 */
public class MessageAction {
    int messageContent;
    int messageId;

    List<MessageInformation> messageInformationList;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public List<MessageInformation> getMessageInformationList() {
        return messageInformationList;
    }

    public void setMessageInformationList(List<MessageInformation> messageInformationList) {
        this.messageInformationList = messageInformationList;
    }

    public int getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(int messageContent) {
        messageContent = messageContent;
    }
    public  String MessageContentAction(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        Studentinformation s = (Studentinformation)session.getOrDefault("AcUser",null);

        MessageService messageService = new MessageService();
        messageContent=messageService.MessageContentService(s.getStudentId());
        return "success";
    }
    public  String QueryMessage(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        Studentinformation s = (Studentinformation)session.getOrDefault("AcUser",null);

        MessageService messageService = new MessageService();
        messageInformationList=messageService.mssage(s.getStudentId());
        return "success";
    }

    public String ModifyMessageState(){
         MessageService messageService = new MessageService();
       boolean re=  messageService.ModifyMessageStateService(messageId);
       return "success";
    }
}
