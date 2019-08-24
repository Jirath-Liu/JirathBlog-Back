package com.jirath.controller;

import com.jirath.model.BlogSortInfo;
import com.jirath.model.BlogTagInfo;
import com.jirath.model.DetailBlogInfo;
import com.jirath.service.EditorService;
import com.jirath.vo.BlogGetInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 修改文章信息的Controller
 * 完成所有功能，其中sort与tag的修改是单独修改
 */
@Controller
@RequestMapping("/admin")
public class EditorController {

    @Autowired
    EditorService editorService;

    @RequestMapping("addBlog.blog")
    public void addBlog(@RequestParam BlogGetInfo blogGetInfo){
        editorService.addBlog(blogGetInfo);
    }

    @RequestMapping("editBlog.blog")
    public void editBlog(@RequestParam DetailBlogInfo detailBlogInfo){
        editorService.editBlog(detailBlogInfo);
    }

    @RequestMapping("editBlogSort.blog")
    public void editBlogSort(@RequestParam BlogSortInfo blogSortInfo){
        editorService.editBlogSort(blogSortInfo);
    }

    @RequestMapping("addBlogTag.blog")
    public void addBlogTag(@RequestParam BlogTagInfo blogTagInfo){
        editorService.addBlogTag(blogTagInfo);
    }

    @RequestMapping("editBlogTag.blog")
    public void editBlogTag(@RequestParam BlogTagInfo blogTagInfo){
        editorService.editBlogTag(blogTagInfo);
    }
    @RequestMapping("deleteBlog.blog")
    public void deleteBlog(Integer blogId){
        editorService.deleteBlog(blogId);
    }
}
