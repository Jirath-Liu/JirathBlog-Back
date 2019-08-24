package com.jirath.service.impl;

import com.jirath.dao.BlogSortsDao;
import com.jirath.dao.BlogTagsDao;
import com.jirath.dao.BlogsDao;
import com.jirath.dao.SortrsDao;
import com.jirath.model.BlogSortInfo;
import com.jirath.model.BlogTagInfo;
import com.jirath.model.DetailBlogInfo;
import com.jirath.model.SortInfo;
import com.jirath.service.EditorService;
import com.jirath.vo.BlogGetInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorServiceImpl implements EditorService {

    @Autowired
    BlogsDao blogsDao;
    @Autowired
    BlogSortsDao blogSortsDao;
    @Autowired
    BlogTagsDao blogTagsDao;
    /**
     * 添加博客
     * 先插入blogs表，再利用返回的主键值(id)，搭建其他表
     */
    public void addBlog(BlogGetInfo blogGetInfo) {
        //将数据分类为两个model
        //blogs使用的model
        DetailBlogInfo detailBlogInfo=new DetailBlogInfo();
        detailBlogInfo.setBlogAuthor(blogGetInfo.getBlogAuthor());
        detailBlogInfo.setBlogContext(blogGetInfo.getBlogContext());
        detailBlogInfo.setBlogCreateTime(blogGetInfo.getBlogCreateTime());
        detailBlogInfo.setBlogTitle(blogGetInfo.getBlogTitle());
        Integer blogId = blogsDao.addBlogInfo(detailBlogInfo);

        //blogtags用的model
        BlogSortInfo blogSortInfo=new BlogSortInfo();;
        blogSortInfo.setBlogId(blogId);
        blogSortInfo.setSortId(blogGetInfo.getBlogSort());

        //blogsorts用的model
        BlogTagInfo blogTagInfo=new BlogTagInfo();;
        blogTagInfo.setBlogId(blogId);
        blogTagInfo.setTagId(blogGetInfo.getBlogTag());

        blogSortsDao.addSort(blogSortInfo);
        blogTagsDao.addBlogTag(blogTagInfo);
    }

    public void editBlog(DetailBlogInfo detailBlogInfo) {
        blogsDao.editBlog(detailBlogInfo);
    }

    public void editBlogSort(BlogSortInfo blogSortInfo) {
        blogSortsDao.editBlogSort(blogSortInfo);
    }

    public void deleteBlog(Integer blogId) {
        blogsDao.deleteBlog(blogId);
        blogSortsDao.deleteBlog(blogId);
        blogTagsDao.deleteBlog(blogId);
    }

    public void addBlogTag(BlogTagInfo blogTagInfo) {
        blogTagsDao.addBlogTag(blogTagInfo);
    }

    public void editBlogTag(BlogTagInfo blogTagInfo) {
        blogTagsDao.editBlogTag(blogTagInfo);
    }
}
