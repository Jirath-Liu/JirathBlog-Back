package com.jirath.controller;

import com.jirath.service.BlogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 获取文章信息的Controller
 * 已完成所有功能
 */
@Controller
public class BlogsController {

    @Autowired
    BlogsService blogsService;

    /**
     * 返回所有文章的列表
     * @return
     */
    @ResponseBody
    @RequestMapping("/allBlogs.blog")
    public Object simpleBlogInfos(){
        return blogsService.getsimpleBlogInfos();
    }

    /**
     *获取详细博客
     * @return
     */
    @ResponseBody
    @GetMapping("/getBlog.blog")
    public Object getDetailBlog(@RequestParam Integer blogId){
        return blogsService.getDetailInfo(blogId);
    }

    /**
     * 获取对应分类的博客
     */
    @ResponseBody
    @GetMapping("/getBlogBySort.blog")
    public Object getBlogBySort(@RequestParam Integer sortId){
        return blogsService.getBlogBySort(sortId);
    }

    /**
     * 获取对应标签的博客
     */
    @ResponseBody
    @GetMapping("/getBlogByTag.blog")
    public Object getBlogByTag(@RequestParam Integer tagId){
        return blogsService.getBlogByTag(tagId);
    }
}
