package com.example.demo.controller;

import com.example.demo.domain.TCar;
import com.example.demo.service.TCarDaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "购物车Controller",tags = "购物车相关接口")
@RestController
@RequestMapping("/car")
public class TCarDaoController {
    @Autowired
    private TCarDaoService tCarDaoService;

    @ApiOperation(value = "添加购物车")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addCar(@RequestBody @ApiParam(name = "tCar",value = "购物车信息json格式",required = true) TCar tCar){
        return tCarDaoService.insert(tCar);
    }

    @ApiOperation(value = "显示购物的商品")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<TCar> listCar(){
        return tCarDaoService.selectAll();
    }
}
