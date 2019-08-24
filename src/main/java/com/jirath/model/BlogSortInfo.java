package com.jirath.model;

import org.apache.ibatis.type.Alias;

@Alias("BlogSortInfo")
public class BlogSortInfo {
    private Integer blogId;
    private Integer sortId;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }
}
