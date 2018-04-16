package com.example.demo.service;

import com.example.demo.dao.TGoodsDao;
import com.example.demo.domain.TGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TGoodsDaoService {
    @Autowired
    private TGoodsDao tGoodsDao;

    //查询所有商品信息
    public List selectGoods(){
        return tGoodsDao.selectAll();
    }
    //查询所有商品分类
    public List selectByType(){
              List<TGoods> list=  tGoodsDao.selectGoodsByType();
              List<String> type=new ArrayList<String>();
              for(TGoods goods:list){
                  type.add( goods.getItemType());
              }
              return type;
    }

    //按商品id查询单个商品的信息
    public TGoods selectById(String id){
        if (tGoodsDao.selectByPrimaryKey(id)==null){
            throw new RuntimeException("该商品不存在");
        }
        return tGoodsDao.selectByPrimaryKey(id);
    }


}
