package com.jirath.dao;

import com.jirath.model.BlogSortInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogSortsDao {
    void addSort(BlogSortInfo blogSortInfo);
    void editBlogSort(BlogSortInfo blogSortInfo);

    void deleteBlog(Integer blogId);

    List<Integer> getBlogBySort(Integer sortId);
}
