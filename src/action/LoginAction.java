package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by d on 2017/7/20.
 */
public class LoginAction extends ActionSupport{
     String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String Login(){

        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        session.put("AcUser","User");
        username="User";
    return "success";
    }
}
