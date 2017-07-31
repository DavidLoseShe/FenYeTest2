package service;

import dao.FlowerDao;

/**
 * Created by d on 2017/7/25.
 */
public class FlowerService {
    public int flwoerConent(String username){
        FlowerDao flowerDao =new FlowerDao();
        return  flowerDao.flowerContent(username);
    }
    public  Boolean flowerSong(String u){
        FlowerDao flowerDao = new FlowerDao();
        return  flowerDao.flowerSong(u);
    }

}
