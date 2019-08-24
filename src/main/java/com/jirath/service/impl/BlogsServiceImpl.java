package com.jirath.service.impl;

import com.jirath.dao.BlogSortsDao;
import com.jirath.dao.BlogTagsDao;
import com.jirath.dao.BlogsDao;
import com.jirath.model.DetailBlogInfo;
import com.jirath.model.SimpleBlogInfo;
import com.jirath.service.BlogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BlogsServiceImpl implements BlogsService {
    @Autowired
    BlogsDao blogsDao;
    @Autowired
    BlogSortsDao blogSortsDao;
    @Autowired
    BlogTagsDao blogTagsDao;

    public List<SimpleBlogInfo> getsimpleBlogInfos(){
        return blogsDao.getSimpleBlogs();
    }

    public DetailBlogInfo getDetailInfo(Integer id) {
        return blogsDao.getDetailInfo(id);
    }

    public List<SimpleBlogInfo> getBlogBySort(Integer sortId) {
        List<Integer> blogsId = blogSortsDao.getBlogBySort(sortId);
        return blogsDao.getSimpleBlogsByIdList(blogsId);
    }

    public List<SimpleBlogInfo> getBlogByTag(Integer tagId) {
        List<Integer> blogsId = blogTagsDao.getBlogByTag(tagId);
        return blogsDao.getSimpleBlogsByIdList(blogsId);
    }
}
