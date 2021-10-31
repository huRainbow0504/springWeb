package com.hu.springweb.Controller;

import com.hu.springweb.Dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息类
 */
@RequestMapping("/user")
@RestController
public class UserInfo {

    @Autowired
    private UserInfo userInfo;

    @Autowired
    private UserInfoDao userInfoDao;

    @RequestMapping("/getuserid")
    public int getUserId(String userName, String pwd) {
        if (userName.isEmpty() || pwd.isEmpty()) {
            return -1;
        }
        int userId = userInfoDao.getUserId(userName, pwd);
        return userId;
    }

    public boolean addNewUser(String userInfo) {
        return false;

    }

}
