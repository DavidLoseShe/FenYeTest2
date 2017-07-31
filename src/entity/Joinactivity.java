package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ${guhao} on 2017/7/31.
 */
@Entity
public class Joinactivity {
    private int sid;
    private Integer activityiid;
    private String peopleiid;
    private String states;

    @Id
    @Column(name = "sid", nullable = false)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "activityiid", nullable = true)
    public Integer getActivityiid() {
        return activityiid;
    }

    public void setActivityiid(Integer activityiid) {
        this.activityiid = activityiid;
    }

    @Basic
    @Column(name = "peopleiid", nullable = true, length = 10)
    public String getPeopleiid() {
        return peopleiid;
    }

    public void setPeopleiid(String peopleiid) {
        this.peopleiid = peopleiid;
    }

    @Basic
    @Column(name = "states", nullable = true, length = 10)
    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Joinactivity that = (Joinactivity) o;

        if (sid != that.sid) return false;
        if (activityiid != null ? !activityiid.equals(that.activityiid) : that.activityiid != null) return false;
        if (peopleiid != null ? !peopleiid.equals(that.peopleiid) : that.peopleiid != null) return false;
        if (states != null ? !states.equals(that.states) : that.states != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (activityiid != null ? activityiid.hashCode() : 0);
        result = 31 * result + (peopleiid != null ? peopleiid.hashCode() : 0);
        result = 31 * result + (states != null ? states.hashCode() : 0);
        return result;
    }
}
