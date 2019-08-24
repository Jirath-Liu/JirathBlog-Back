package com.jirath.service;

import com.jirath.model.DetailBlogInfo;
import com.jirath.model.SimpleBlogInfo;

import java.util.List;

public interface BlogsService {
    List<SimpleBlogInfo> getsimpleBlogInfos();
    DetailBlogInfo getDetailInfo(Integer id);
    List<SimpleBlogInfo> getBlogBySort(Integer sortId);
    List<SimpleBlogInfo> getBlogByTag(Integer tagId);
}
