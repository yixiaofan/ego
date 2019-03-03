package com.ego.manage.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.manage.service.TbItemService;
import com.ego.pojo.TbItem;

@Controller
public class TbItemControler {
    @Resource
    private TbItemService tbItemServiceIpl;
    /*
     * 分页显示商品
     */
    @RequestMapping("item/list")
    @ResponseBody
    public EasyUIDataGrid show(int page,int rows){
	return tbItemServiceIpl.show(page, rows);
    }
    
    @RequestMapping("rest/page/item-edit")
    public String showItemEdit(){
	return "item-edit";
    }
    
    /*
     * 商品删除
     */
    @RequestMapping("rest/item/delete")
    @ResponseBody
    public EgoResult delete(String ids){
	EgoResult er=new EgoResult();
	int index=tbItemServiceIpl.update(ids, (byte)3);
	if(index==1){
	    er.setStatus(200);
	}
	return er;
    }
    
    /*
     * 商品上架
     */
    @RequestMapping("rest/item/reshelf")
    @ResponseBody
    public EgoResult reshelf(String ids){
	EgoResult er=new EgoResult();
	int index=tbItemServiceIpl.update(ids, (byte)1);
	if(index==1){
	    er.setStatus(200);
	}
	return er;
    }
    
    /*
     * 商品下架
     */
    @RequestMapping("rest/item/instock")
    @ResponseBody
    public EgoResult instock(String ids){
	EgoResult er=new EgoResult();
	int index=tbItemServiceIpl.update(ids, (byte)2);
	if(index==1){
	    er.setStatus(200);
	}
	return er;
    }
    
    /*
     * 商品新增
     */
    @RequestMapping("item/save")
    @ResponseBody
    public EgoResult insert(TbItem item,String desc,String itemParams){
	EgoResult er=new EgoResult();
	int index;
	try {
	    index=tbItemServiceIpl.save(item, desc, itemParams);
	    if(index==1){
	        er.setStatus(200);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return er;
    }
}
