package com.example.demo.service;

import com.example.demo.dao.TAddressDao;
import com.example.demo.domain.TAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TAddressDaoService {
    @Autowired
    private TAddressDao tAddressDao;

    //通过id查询地址
    public TAddress listAddressByid(Integer id){
        if(tAddressDao.selectByPrimaryKey(id)==null){
            throw new RuntimeException("该用户地址不存在");
        }
        return tAddressDao.selectByPrimaryKey(id);
    }
    //查询所有用户的地址信息
    public List<TAddress> listAddressAll(){
        return tAddressDao.selectAll();
    }
    //添加地址
    public String insertAddress(TAddress tAddress){
        tAddressDao.insertSelective(tAddress);
        return "插入成功";
    }
    //修改地址
    public String updateById(TAddress tAddress){
        if (tAddressDao.selectSelectivekey(tAddress)==null){
            return "要修改的用户Id不存在";
        }
        tAddressDao.updateByPrimaryKeySelective(tAddress);
        return "修改成功";
    }
    //删除地址
    public String deleteById(Integer id){
       tAddressDao.deleteByPrimaryKey(id);
       return "删除成功";
    }
}
