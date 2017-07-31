package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.Studentinformation;
import service.LoginService;

import java.util.Map;

/**
 * Created by d on 2017/7/20.
 */
public class LoginAction extends ActionSupport{
     String username;
     String Password;
     Studentinformation stduent;

    public Studentinformation getStduent() {
        return stduent;
    }

    public void setStduent(Studentinformation stduent) {
        this.stduent = stduent;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String Login(){


        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        Studentinformation s = (Studentinformation)session.getOrDefault("AcUser",null);
        LoginService loginService = new LoginService();
        stduent=loginService.Student(username);
        if(s==null)   session.put("AcUser",stduent);
        if(stduent!=null) {
            if (stduent.getStudentPassword().equals(Password)) return "success";
        }
    return "error";
    }

}
