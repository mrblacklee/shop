package com.example.demo.controller;

import com.example.demo.domain.TGoods;
import com.example.demo.service.TGoodsDaoService;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "商品Controller",tags = "商品相关接口")
@RestController
@RequestMapping("/goods")
public class TGoodsDaoController {
    @Autowired
    private TGoodsDaoService tGoodsDaoService;

    @ApiOperation(value = "查询所有商品",notes = "商品详情")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public List listGoods(){
        PageHelper.startPage(1,1);
        return tGoodsDaoService.selectGoods();
    }
    @ApiOperation(value = "查询所有商品的分类",notes = "商品类别")
    @RequestMapping(value = "/listType",method = RequestMethod.GET)
    public List listGoodsByType(){
        PageHelper.offsetPage(2,5);
        return tGoodsDaoService.selectByType();
    }
    @ApiOperation(value = "查询商品信息",notes = "通过商品Id来查询")
    @RequestMapping(value = "/listById",method = RequestMethod.GET)
    public TGoods selectTgoodsById(@RequestParam @ApiParam(name = "id",value = "商品的id",required = true) String id){
       return tGoodsDaoService.selectById(id);
    }





}
