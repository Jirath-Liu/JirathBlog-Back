package com.jirath.dao;

import com.jirath.model.BlogTagInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogTagsDao {
    void addBlogTag(BlogTagInfo blogTagInfo);
    void editBlogTag(BlogTagInfo blogTagInfo);
    void deleteBlog(Integer blogId);
    void deleteTag(Integer tagId);
    List<Integer> getBlogByTag(Integer tagId);
}
