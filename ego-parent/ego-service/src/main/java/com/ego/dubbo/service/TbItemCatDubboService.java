package com.ego.dubbo.service;

import java.util.List;
import com.ego.pojo.TbItemCat;

public interface TbItemCatDubboService {
    /*
     * 根据父类目id查询所有子类目
     */
    List<TbItemCat> show(long pid);
    
    /*
     * 根据类目id查询
     */
    TbItemCat selById(long id);
}
