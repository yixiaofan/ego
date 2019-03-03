package com.ego.manage.service;

import org.springframework.stereotype.Service;
import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.pojo.TbItemParam;

@Service
public interface TbItemParamService {
    /*
     * 分页显示商品规格参数
     */
    EasyUIDataGrid showPage(int page,int rows);
    
    /*
     * 批量删除
     */
    int delete(String ids) throws Exception;
    
    /*
     * 根据类目id查询模板信息
     */
    EgoResult showParam(long catId);
    
    /*
     * 新增模板信息
     */
    EgoResult save(TbItemParam param);
}
