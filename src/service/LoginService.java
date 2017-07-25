package service;

import dao.LoginDao;
import entity.Studentinformation;

/**
 * Created by d on 2017/7/24.
 */
public class LoginService {
    public Studentinformation Student(String username){
        LoginDao loginDao = new LoginDao();
        return  loginDao.Student(username);

    }
}
