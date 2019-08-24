package com.jirath.dao;

import com.jirath.model.TagInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagsDao {
    List<TagInfo> getAllTags();

    void addTag(TagInfo tagInfo);

    void deleteTag(Integer tagId);

    void editTag(TagInfo tagInfo);
}
