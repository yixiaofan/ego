package com.ego.dubbo.service;
import com.ego.pojo.TbItemDesc;

public interface TbItemDescDubboService {
    /*
     * 新增
     */
    int insDesc(TbItemDesc itemDesc);
    
    /*
     * 根据主键查询商品描述对象
     */
    TbItemDesc selByItemid(long itemid);
}
