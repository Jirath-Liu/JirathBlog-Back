package com.jirath.service;

import com.jirath.model.TagInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TagsService {
    List<TagInfo> getAllTags();
    void addTag(TagInfo tagInfo);

    void deleteTag(Integer tagId);
    void editTag(TagInfo tagInfo);

}
