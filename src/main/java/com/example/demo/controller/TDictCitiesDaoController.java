package com.example.demo.controller;

import com.example.demo.service.TDictCitiesDaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "市Controller",tags = "市相关接口操作")
@RestController
@RequestMapping("/cities")
public class TDictCitiesDaoController {
    @Autowired
    private TDictCitiesDaoService tDictCitiesDaoService;

    @ApiOperation(value = "查询所有市",notes ="" )
    @RequestMapping(value = "/lists",method = RequestMethod.GET)
    public List listCities(){
        return tDictCitiesDaoService.selectCities();
    }
}
