package com.example.demo.controller;

import com.example.demo.service.TDictAreasDaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Api(value = "区Controller",tags = "区相关接口")
@RestController
@RequestMapping("/areas")
public class TDictAreasDaoController {
    @Autowired
    private TDictAreasDaoService tDictAreasDaoService;

    @ApiOperation(value = "查询所有区",notes ="" )
    @RequestMapping(value = "/lists",method = RequestMethod.GET)
    public List listAreas(){
        return tDictAreasDaoService.selectAreas();
    }
}
