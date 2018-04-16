package com.example.demo.service;

import com.example.demo.dao.TUserDao;
import com.example.demo.domain.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TUserDaoService {
    @Autowired
    private TUserDao tUserDao;

    //用户注册
    public String register(TUser tUser){
        if (tUserDao.selectUserName(tUser.getUsername())==null){
            tUserDao.insertSelective(tUser);
            return "插入成功";
        }else {
            return "该用户名已存在";
        }

    }
 //用户登录
    public List<TUser> Login(String username, String password){
        List<TUser> list=new ArrayList<TUser>();
        if(tUserDao.selectUserName(username)==null){
            throw new RuntimeException("该用户未注册");
        }
        TUser user=tUserDao.selectUserByUserName(username);
        if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
          list.add(user);
          return list;
        }else {
            throw new RuntimeException("用户名或密码错误");
        }
    }

    //通过用户id查询用户信息
    public TUser checkTUser(Integer id){
        if (tUserDao.selectByPrimaryKey(id)==null){
            throw new RuntimeException("该用户未注册");
        }
        return tUserDao.selectByPrimaryKey(id);
    }
    //查询所有用户id
    public List checkTUserId(){
        List<TUser> listId=tUserDao.selectAllUserId();
        List<Integer> list=new ArrayList<Integer>();
        for (TUser t:listId){
            list.add(t.getId());
        }
        return list;

    }
    //用户修改密码
    public String changePwd(Integer id,String oldPassword,String password){
       TUser tUser= tUserDao.selectByPrimaryKey(id);
        if (tUser==null){
            return "该用户未注册";
        }
        if(tUser.getPassword().equals(oldPassword)){
            tUser.setPassword(password);
            tUserDao.updatePwd(tUser);
            return "修改成功";
        }else {
            return "原密码错误";
        }

    }
    //用户修改信息
    public String changeUser(TUser tUser){
        if(tUserDao.selectByPrimaryKey(tUser.getId())==null){
            return "该用户未注册";
        };
        tUserDao.updateByPrimaryKeySelective(tUser);
        return "修改成功";
    }
    //根据用户id删除用户
    public String deleteUser(Integer id){
        tUserDao.deleteByPrimaryKey(id);
        return "删除成功";
    }

}
