package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by d on 2017/7/20.
 */
@Entity
public class Studentinformation {
    private String studentId;
    private String studentPassword;
    private String studentName;
    private String studentClass;
    private String stduentQq;
    private String studentSay;

    @Id
    @Column(name = "StudentId", nullable = false, length = 255)
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "StudentPassword", nullable = true, length = 255)
    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    @Basic
    @Column(name = "StudentName", nullable = true, length = 255)
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Basic
    @Column(name = "StudentClass", nullable = true, length = 255)
    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Basic
    @Column(name = "StduentQQ", nullable = true, length = 255)
    public String getStduentQq() {
        return stduentQq;
    }

    public void setStduentQq(String stduentQq) {
        this.stduentQq = stduentQq;
    }

    @Basic
    @Column(name = "StudentSay", nullable = true, length = 255)
    public String getStudentSay() {
        return studentSay;
    }

    public void setStudentSay(String studentSay) {
        this.studentSay = studentSay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Studentinformation that = (Studentinformation) o;

        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (studentPassword != null ? !studentPassword.equals(that.studentPassword) : that.studentPassword != null)
            return false;
        if (studentName != null ? !studentName.equals(that.studentName) : that.studentName != null) return false;
        if (studentClass != null ? !studentClass.equals(that.studentClass) : that.studentClass != null) return false;
        if (stduentQq != null ? !stduentQq.equals(that.stduentQq) : that.stduentQq != null) return false;
        if (studentSay != null ? !studentSay.equals(that.studentSay) : that.studentSay != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (studentPassword != null ? studentPassword.hashCode() : 0);
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (studentClass != null ? studentClass.hashCode() : 0);
        result = 31 * result + (stduentQq != null ? stduentQq.hashCode() : 0);
        result = 31 * result + (studentSay != null ? studentSay.hashCode() : 0);
        return result;
    }
}
