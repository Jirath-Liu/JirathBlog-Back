package com.jirath.controller;

import com.jirath.model.SortInfo;
import com.jirath.service.SortsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 分类相关操作的Controller
 * 完成所有功能
 */
@Controller
public class SortsController {

    @Autowired
    SortsService sortsService;

    @RequestMapping("addsSort.blog")
    public void addSort(SortInfo sortInfo){
        sortsService.addSort(sortInfo);
    }
    @RequestMapping("allsorts.blog")
    public Object getAllSorts(){
        return sortsService.getAllSorts();
    }
    @RequestMapping("editSort")
    public void editSort(@RequestParam SortInfo sortInfo){
        sortsService.editSort(sortInfo);
    }
    @RequestMapping("deleteSort")
    public void deleteSort(Integer sortId) {
        sortsService.deleteSort(sortId);
    }
}
