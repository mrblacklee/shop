package com.example.demo.service;

import com.example.demo.dao.TDictCitiesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TDictCitiesDaoService {
    @Autowired
    private TDictCitiesDao tDictCitiesDao;
    public List selectCities(){
        return tDictCitiesDao.selectAll();
    }
}
