package com.jirath.service;

import com.jirath.model.SortInfo;
import com.jirath.vo.BlogGetInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SortsService {
    List<SortInfo> getAllSorts();
    void addSort(SortInfo sortInfo);

    void deleteSort(Integer sortId);
    void editSort(SortInfo sortInfo);
}
