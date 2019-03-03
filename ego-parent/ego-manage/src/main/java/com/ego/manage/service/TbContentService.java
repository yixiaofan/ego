package com.ego.manage.service;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.pojo.TbContent;

public interface TbContentService {
    /*
     * 分页显示内容信息
     */
    EasyUIDataGrid showContent(long categoryId,int page,int rows);
    
    /*
     * 新增内容
     */
    int save(TbContent content);
}