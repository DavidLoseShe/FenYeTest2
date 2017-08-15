package entity;

import javax.persistence.*;

/**
 * Created by ${guhao} on 2017/8/14.
 */
@Entity
@Table(name = "messagetable", schema = "studentactivity", catalog = "")
public class MessageInformation {
    private int messageId;
    private String messageSendId;
    private String messageReceiveId;
    private String messageContent;
    private String messageTime;
    private String messageState;

    @Id
    @Column(name = "messageId", nullable = false)
    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    @Basic
    @Column(name = "messageSendId", nullable = true, length = 10)
    public String getMessageSendId() {
        return messageSendId;
    }

    public void setMessageSendId(String messageSendId) {
        this.messageSendId = messageSendId;
    }

    @Basic
    @Column(name = "messageReceiveId", nullable = true, length = 10)
    public String getMessageReceiveId() {
        return messageReceiveId;
    }

    public void setMessageReceiveId(String messageReceiveId) {
        this.messageReceiveId = messageReceiveId;
    }

    @Basic
    @Column(name = "messageContent", nullable = true, length = 255)
    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    @Basic
    @Column(name = "messageTime", nullable = true, length = 255)
    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }

    @Basic
    @Column(name = "messageState", nullable = true, length = 255)
    public String getMessageState() {
        return messageState;
    }

    public void setMessageState(String messageState) {
        this.messageState = messageState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageInformation that = (MessageInformation) o;

        if (messageId != that.messageId) return false;
        if (messageSendId != null ? !messageSendId.equals(that.messageSendId) : that.messageSendId != null)
            return false;
        if (messageReceiveId != null ? !messageReceiveId.equals(that.messageReceiveId) : that.messageReceiveId != null)
            return false;
        if (messageContent != null ? !messageContent.equals(that.messageContent) : that.messageContent != null)
            return false;
        if (messageTime != null ? !messageTime.equals(that.messageTime) : that.messageTime != null) return false;
        if (messageState != null ? !messageState.equals(that.messageState) : that.messageState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = messageId;
        result = 31 * result + (messageSendId != null ? messageSendId.hashCode() : 0);
        result = 31 * result + (messageReceiveId != null ? messageReceiveId.hashCode() : 0);
        result = 31 * result + (messageContent != null ? messageContent.hashCode() : 0);
        result = 31 * result + (messageTime != null ? messageTime.hashCode() : 0);
        result = 31 * result + (messageState != null ? messageState.hashCode() : 0);
        return result;
    }
}
