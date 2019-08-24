package com.jirath.vo;

import java.util.Date;

public class BlogGetInfo {
    private Integer blogId;
    private String blogAuthor;
    private Date blogCreateTime;
    private String blogTitle;
    private String blogContext;
    private Integer blogTag;
    private Integer blogSort;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor;
    }

    public Date getBlogCreateTime() {
        return blogCreateTime;
    }

    public void setBlogCreateTime(Date blogCreateTime) {
        this.blogCreateTime = blogCreateTime;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContext() {
        return blogContext;
    }

    public void setBlogContext(String blogContext) {
        this.blogContext = blogContext;
    }

    public Integer getBlogTag() {
        return blogTag;
    }

    public void setBlogTag(Integer blogTag) {
        this.blogTag = blogTag;
    }

    public Integer getBlogSort() {
        return blogSort;
    }

    public void setBlogSort(Integer blogSort) {
        this.blogSort = blogSort;
    }
}
