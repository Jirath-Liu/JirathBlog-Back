package com.jirath.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 *这个类用的是mapper所以没有加注解
 */
@Alias("BlogInfo")
public class SimpleBlogInfo {
    private Integer blogId;
    private String blogAuthor;
    private Date blogCreateTime;
    private String blogTitle;

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

}
