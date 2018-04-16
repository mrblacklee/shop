package com.example.demo.service;

import com.example.demo.dao.TCarDao;
import com.example.demo.domain.TCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCarDaoService {
    @Autowired
    private TCarDao tCarDao;
    //添加购物车
    public String insert(TCar tCar){
        tCarDao.insert(tCar);
        return "添加购物车成功";
    }
    public List<TCar> selectAll(){
        return tCarDao.selectAll();
    }
}
