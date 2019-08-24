package com.jirath.service;

import com.jirath.model.BlogSortInfo;
import com.jirath.model.BlogTagInfo;
import com.jirath.model.DetailBlogInfo;
import com.jirath.model.SortInfo;
import com.jirath.vo.BlogGetInfo;
import org.springframework.web.bind.annotation.RequestParam;

public interface EditorService {
    void addBlog(BlogGetInfo blogGetInfo);

    void editBlog(DetailBlogInfo detailBlogInfo);

    void editBlogSort(BlogSortInfo blogSortInfo);

    void deleteBlog(Integer blogId);

    void addBlogTag(BlogTagInfo blogTagInfo);
    void editBlogTag(BlogTagInfo blogTagInfo);
}
