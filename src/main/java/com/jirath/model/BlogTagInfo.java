package com.jirath.model;

import org.apache.ibatis.type.Alias;

@Alias("BlogTagInfo")
public class BlogTagInfo {
    private Integer tagId;
    private Integer blogId;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }
}
