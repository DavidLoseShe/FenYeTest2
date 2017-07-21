package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by d on 2017/7/20.
 */
@Entity
public class Remarkinformation {
    private int remarkId;
    private Integer activityId;
    private String studentId;
    private String remarkContent;
    private String remarkTime;

    @Id
    @Column(name = "remarkId", nullable = false)
    public int getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(int remarkId) {
        this.remarkId = remarkId;
    }

    @Basic
    @Column(name = "activityId", nullable = true)
    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    @Basic
    @Column(name = "studentId", nullable = true, length = 255)
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "remarkContent", nullable = true, length = 255)
    public String getRemarkContent() {
        return remarkContent;
    }

    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent;
    }

    @Basic
    @Column(name = "remarkTime", nullable = true, length = 255)
    public String getRemarkTime() {
        return remarkTime;
    }

    public void setRemarkTime(String remarkTime) {
        this.remarkTime = remarkTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Remarkinformation that = (Remarkinformation) o;

        if (remarkId != that.remarkId) return false;
        if (activityId != null ? !activityId.equals(that.activityId) : that.activityId != null) return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (remarkContent != null ? !remarkContent.equals(that.remarkContent) : that.remarkContent != null)
            return false;
        if (remarkTime != null ? !remarkTime.equals(that.remarkTime) : that.remarkTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = remarkId;
        result = 31 * result + (activityId != null ? activityId.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (remarkContent != null ? remarkContent.hashCode() : 0);
        result = 31 * result + (remarkTime != null ? remarkTime.hashCode() : 0);
        return result;
    }
}
