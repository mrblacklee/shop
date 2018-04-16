package com.example.demo.controller;

import com.example.demo.service.TDictProvincesDaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "省Controller",tags = "省相关接口")
@RestController
@RequestMapping("/provinces")
public class TDictProvincesDaoController {
    @Autowired
    TDictProvincesDaoService provinService;

    @ApiOperation(value ="查询所有省",notes = "")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public List listAddress(){
        return provinService.selectProvinces();
    }
}
