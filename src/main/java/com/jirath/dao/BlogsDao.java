package com.jirath.dao;

import com.jirath.model.BlogSortInfo;
import com.jirath.model.BlogTagInfo;
import com.jirath.model.DetailBlogInfo;
import com.jirath.model.SimpleBlogInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogsDao {
    List<SimpleBlogInfo> getSimpleBlogs ();

    DetailBlogInfo getDetailInfo(Integer id);

    Integer addBlogInfo(DetailBlogInfo detailBlogInfo);

    void editBlog(DetailBlogInfo detailBlogInfo);

    void deleteBlog(Integer blogId);

    List<SimpleBlogInfo> getSimpleBlogsByIdList (List<Integer> blogIdList);

}
