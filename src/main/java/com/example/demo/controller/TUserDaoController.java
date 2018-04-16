package com.example.demo.controller;

import com.example.demo.domain.TUser;
import com.example.demo.service.TUserDaoService;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
@Api(value = "用户controller", tags = {"用户操作接口"})
public class TUserDaoController {
    @Autowired
    private TUserDaoService tUserDaoService;

    @ApiOperation(value = "注册",notes ="用户注册" )
    @RequestMapping(value = "/toLogin",method = RequestMethod.POST)
    public String Regilst(@RequestBody @ApiParam(name = "tUser",value ="用户的信息json格式") TUser tUser){
        return tUserDaoService.register(tUser);
    }

    @ApiOperation(value = "登录",notes = "根据用户名和密码登录")
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public List<TUser> UserLogin(@RequestParam @ApiParam(name = "username",value = "用户名",required = true) String username,
                                 @RequestParam @ApiParam(name = "password",value = "用户密码",required = true) String password){
       return tUserDaoService.Login(username,password);
    }

    @ApiOperation(value = "查询个人信息",notes = "根据用户id查询信息")
    @RequestMapping(value = "/check",method = RequestMethod.GET)
    public TUser CheckTuser(@RequestParam @ApiParam(name = "id",value = "用户id",required = true) Integer id){
       return tUserDaoService.checkTUser(id);
    }

    @ApiOperation(value = "查询10个用户Id",notes = "查询所有已注册用户的Id每页10个")
    @RequestMapping(value = "/checkId",method = RequestMethod.GET)
    public List CheckId(){
        PageHelper.startPage(1,10,true);
       return tUserDaoService.checkTUserId();
    }

    @ApiOperation(value = "修改密码",notes = "通过用户id修改密码")
    @RequestMapping(value = "/changepwd",method = RequestMethod.PUT)
    public String changPwd(@RequestParam @ApiParam(name = "id",value = "用户id",required = true) Integer id,
                           @RequestParam @ApiParam(name = "oldPassword",value = "用户原密码",required = true) String oldPassword,
                           @RequestParam @ApiParam(name = "password",value = "用户新密码",required = true) String password){
        return tUserDaoService.changePwd(id,oldPassword,password);
    }

    @ApiOperation(value ="修改用户信息",notes = "通过用户id修改信息")
    @RequestMapping(value = "/changeUser",method = RequestMethod.PUT)
    public String changUser(@RequestBody @ApiParam(name = "tUser",value = "用户要修改的信息json格式",required = true) TUser tUser){
      return   tUserDaoService.changeUser(tUser);
    }

    @ApiOperation(value = "删除用户",notes = "通过用户id删除用户")
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public String deleteUser(@RequestParam @ApiParam(name = "id",value = "用户id",required = true) Integer id){
        return tUserDaoService.deleteUser(id);
    }
}
