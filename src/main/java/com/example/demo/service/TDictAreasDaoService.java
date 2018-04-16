package com.example.demo.service;

import com.example.demo.dao.TDictAreasDao;
import com.example.demo.domain.TDictAreas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TDictAreasDaoService {
    @Autowired
    private TDictAreasDao tDictAreasDao;
    public List selectAreas(){
        return tDictAreasDao.selectAll();
    }

}
