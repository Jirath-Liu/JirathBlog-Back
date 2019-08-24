package com.jirath.dao;

import com.jirath.model.BlogSortInfo;
import com.jirath.model.SortInfo;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface SortrsDao {

    List<SortInfo> getAllSorts();

    void addSort(SortInfo sortInfo);

    /**
     * 将博客放在未分类中
     * @param sortId
     */
    void deleteSort(Integer sortId);

    void editSort(SortInfo sortInfo);
}
