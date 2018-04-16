package com.example.demo.service;

import com.example.demo.dao.TDictProvincesDao;
import com.example.demo.domain.TDictProvinces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TDictProvincesDaoService {
    @Autowired
    private TDictProvincesDao tDictProvincesDao;
    public List selectProvinces(){
       return tDictProvincesDao.selectAll();
    }

}
