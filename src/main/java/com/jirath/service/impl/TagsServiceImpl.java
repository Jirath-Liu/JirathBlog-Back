package com.jirath.service.impl;

import com.jirath.dao.BlogTagsDao;
import com.jirath.dao.TagsDao;
import com.jirath.dao.TagsDao;
import com.jirath.model.TagInfo;
import com.jirath.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagsServiceImpl implements TagsService {
    @Autowired
    TagsDao tagsDao;
    @Autowired
    BlogTagsDao blogTagsDao;

    public List<TagInfo> getAllTags() {
        return tagsDao.getAllTags();
    }

    public void addTag(TagInfo tagInfo) {
        tagsDao.addTag(tagInfo);
    }

    public void deleteTag(Integer tagId) {
        tagsDao.deleteTag(tagId);
        blogTagsDao.deleteTag(tagId);
    }

    public void editTag(TagInfo tagInfo) {
        tagsDao.editTag(tagInfo);
    }
}
