package com.example.demo.controller;

import com.example.demo.domain.TAddress;
import com.example.demo.service.TAddressDaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "地址Controller",tags = {"地址管理接口"})
@RestController
@RequestMapping("/address")
public class TAdressDaoController {
    @Autowired
    private TAddressDaoService tAddressDaoService;

    @ApiOperation(value = "查询地址信息",notes = "通过地址id查询")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public TAddress checkAddressById(@RequestParam @ApiParam(name = "id",value = "地址id",required = true) Integer id){
       return tAddressDaoService.listAddressByid(id);
    }
    @ApiOperation(value = "查询所有用户地址")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public List<TAddress> checkAddressAll(){
        return tAddressDaoService.listAddressAll();
    }

    @ApiOperation(value = "添加地址")
    @RequestMapping(value = "/addAddress",method = RequestMethod.POST)
    public String insertAddress(@RequestBody @ApiParam(name = "tAddress",value = "地址相关信息json格式") TAddress tAddress){
        return tAddressDaoService.insertAddress(tAddress);
    }

    @ApiOperation(value = "修改用户地址",notes = "通过地址id修改地址")
    @RequestMapping(value = "/updateaddress",method = RequestMethod.PUT)
    public String updateAddressById(@RequestBody @ApiParam(name = "tAddress",value = "用户要修改的信息json格式") TAddress tAddress){
        return tAddressDaoService.updateById(tAddress);
    }
    @ApiOperation(value = "删除地址",notes = "通过地址id删除地址")
    @RequestMapping(value = "/deleteAddress",method = RequestMethod.DELETE)
    public String deleteAddressById(@RequestParam @ApiParam(name = "id",value = "根据id删除地址") Integer id){
        return tAddressDaoService.deleteById(id);
    }
}
