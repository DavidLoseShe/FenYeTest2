package action;

import com.opensymphony.xwork2.ActionSupport;
import service.FlowerService;

/**
 * Created by d on 2017/7/25.
 */
public class RemarkAction extends ActionSupport{
    String username;
    String u;
    int i;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String song(){
        FlowerService flowerService = new FlowerService();
        i= flowerService.flwoerConent(username);
       if(i!=-1)
       flowerService.flowerSong(u);
        return "success";
    }
}
