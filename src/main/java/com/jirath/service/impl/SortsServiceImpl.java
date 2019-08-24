package com.jirath.service.impl;

import com.jirath.dao.BlogSortsDao;
import com.jirath.dao.SortrsDao;
import com.jirath.model.SortInfo;
import com.jirath.service.SortsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortsServiceImpl implements SortsService {
    @Autowired
    SortrsDao sortsDao;
    @Autowired
    BlogSortsDao blogSortsDao;
    public List<SortInfo> getAllSorts() {
        return sortsDao.getAllSorts();
    }

    public void addSort(SortInfo sortInfo) {
        sortsDao.addSort(sortInfo);
    }

    public void deleteSort(Integer sortId) {
        sortsDao.deleteSort(sortId);
        blogSortsDao.deleteBlog(sortId);
    }

    public void editSort(SortInfo sortInfo) {
        sortsDao.editSort(sortInfo);
    }
}
