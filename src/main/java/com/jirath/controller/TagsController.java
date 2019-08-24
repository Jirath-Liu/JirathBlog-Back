package com.jirath.controller;

import com.jirath.model.TagInfo;
import com.jirath.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TagsController {
    @Autowired
    TagsService tagsService;

    @RequestMapping("addsTag.blog")
    public void addTag(TagInfo tagInfo){
        tagsService.addTag(tagInfo);
    }
    @RequestMapping("alltags.blog")
    public Object getAllTag(){
        return tagsService.getAllTags();
    }
    @RequestMapping("editTag")
    public void editTag(@RequestParam TagInfo tagInfo){
        tagsService.editTag(tagInfo);
    }

    @RequestMapping("deleteTag")
    public void deleteTag(Integer tagId) {
        tagsService.deleteTag(tagId);
    }
}
