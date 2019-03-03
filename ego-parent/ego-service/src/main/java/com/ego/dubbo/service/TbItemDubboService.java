package com.ego.dubbo.service;

import java.util.List;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.pojo.TbItem;
import com.ego.pojo.TbItemDesc;
import com.ego.pojo.TbItemParamItem;

public interface TbItemDubboService {
    /*
     * 商品分页查询
     */
    EasyUIDataGrid show(int page,int rows);
    
    /*
     * 根据id修改状态
     */
    int updItemStatus(TbItem tbItem);
    
    /*
     * 商品新增
     */
    int insTbItem(TbItem tbItem);
    
    /*
     * 新增包含商品表和商品描述表
     */
    int insTbItemDesc(TbItem tbItem,TbItemDesc desc,TbItemParamItem paramItem) throws Exception;
    
    /*
     * 通过状态查询全部可用数据
     */
    List<TbItem> selAllByStatus(byte status);
    
    /*
     * 根据主键查询
     */
    TbItem selById(long id);
}
