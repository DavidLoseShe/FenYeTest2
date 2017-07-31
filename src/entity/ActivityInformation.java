package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by d on 2017/7/12.
 */
@Entity
public class ActivityInformation {
    private int activityId;
    private String activityName;
    private String activityAddress;
    private String activityPeopleRemainNum;
    private String activityPeopleNum;
    private String activityContent;
    private String activityKind;
    private String activityStartTime;
    private String activityEndTime;
    private String activityTime;
    private String activityPeopleId;
    private String activityState;


    @Id
    @Column(name = "ActivityId", nullable = false)
    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    @Basic
    @Column(name = "ActivityName", nullable = true, length = 255)
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    @Basic
    @Column(name = "ActivityAddress", nullable = true, length = 255)
    public String getActivityAddress() {
        return activityAddress;
    }

    public void setActivityAddress(String activityAddress) {
        this.activityAddress = activityAddress;
    }

    @Basic
    @Column(name = "ActivityPeopleRemainNum", nullable = true, length = 3)
    public String getActivityPeopleRemainNum() {
        return activityPeopleRemainNum;
    }

    public void setActivityPeopleRemainNum(String activityPeopleRemainNum) {
        this.activityPeopleRemainNum = activityPeopleRemainNum;
    }

    @Basic
    @Column(name = "ActivityPeopleNum", nullable = true, length = 3)
    public String getActivityPeopleNum() {
        return activityPeopleNum;
    }

    public void setActivityPeopleNum(String activityPeopleNum) {
        this.activityPeopleNum = activityPeopleNum;
    }

    @Basic
    @Column(name = "ActivityContent", nullable = false, length = 255)
    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent;
    }

    @Basic
    @Column(name = "ActivityKind", nullable = true, length = 255)
    public String getActivityKind() {
        return activityKind;
    }

    public void setActivityKind(String activityKind) {
        this.activityKind = activityKind;
    }

    @Basic
    @Column(name = "ActivityStartTime", nullable = true, length = 255)
    public String getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(String activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    @Basic
    @Column(name = "ActivityEndTime", nullable = true, length = 255)
    public String getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(String activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    @Basic
    @Column(name = "ActivityTime", nullable = true, length = 255)
    public String getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }

    @Basic
    @Column(name = "ActivityPeopleId", nullable = true, length = 255)
    public String getActivityPeopleId() {
        return activityPeopleId;
    }

    public void setActivityPeopleId(String activityPeopleId) {
        this.activityPeopleId = activityPeopleId;
    }

    @Basic
    @Column(name = "ActivityState", nullable = true, length = 255)
    public String getActivityState() {
        return activityState;
    }

    public void setActivityState(String activityState) {
        this.activityState = activityState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActivityInformation that = (ActivityInformation) o;

        if (activityId != that.activityId) return false;
        if (activityName != null ? !activityName.equals(that.activityName) : that.activityName != null) return false;
        if (activityAddress != null ? !activityAddress.equals(that.activityAddress) : that.activityAddress != null)
            return false;
        if (activityPeopleRemainNum != null ? !activityPeopleRemainNum.equals(that.activityPeopleRemainNum) : that.activityPeopleRemainNum != null)
            return false;
        if (activityPeopleNum != null ? !activityPeopleNum.equals(that.activityPeopleNum) : that.activityPeopleNum != null)
            return false;
        if (activityContent != null ? !activityContent.equals(that.activityContent) : that.activityContent != null)
            return false;
        if (activityKind != null ? !activityKind.equals(that.activityKind) : that.activityKind != null) return false;
        if (activityStartTime != null ? !activityStartTime.equals(that.activityStartTime) : that.activityStartTime != null)
            return false;
        if (activityEndTime != null ? !activityEndTime.equals(that.activityEndTime) : that.activityEndTime != null)
            return false;
        if (activityTime != null ? !activityTime.equals(that.activityTime) : that.activityTime != null) return false;
        if (activityPeopleId != null ? !activityPeopleId.equals(that.activityPeopleId) : that.activityPeopleId != null)
            return false;
        if (activityState != null ? !activityState.equals(that.activityState) : that.activityState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = activityId;
        result = 31 * result + (activityName != null ? activityName.hashCode() : 0);
        result = 31 * result + (activityAddress != null ? activityAddress.hashCode() : 0);
        result = 31 * result + (activityPeopleRemainNum != null ? activityPeopleRemainNum.hashCode() : 0);
        result = 31 * result + (activityPeopleNum != null ? activityPeopleNum.hashCode() : 0);
        result = 31 * result + (activityContent != null ? activityContent.hashCode() : 0);
        result = 31 * result + (activityKind != null ? activityKind.hashCode() : 0);
        result = 31 * result + (activityStartTime != null ? activityStartTime.hashCode() : 0);
        result = 31 * result + (activityEndTime != null ? activityEndTime.hashCode() : 0);
        result = 31 * result + (activityTime != null ? activityTime.hashCode() : 0);
        result = 31 * result + (activityPeopleId != null ? activityPeopleId.hashCode() : 0);
        result = 31 * result + (activityState != null ? activityState.hashCode() : 0);
        return result;
    }
}
