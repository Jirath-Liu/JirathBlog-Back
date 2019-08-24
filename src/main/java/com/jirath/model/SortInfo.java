package com.jirath.model;

import org.apache.ibatis.type.Alias;

@Alias("SortInfo")
public class SortInfo {
    private Integer sortId;
    private String sortName;
    private String sortDescription;
    private Integer sortParent;

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortDescription() {
        return sortDescription;
    }

    public void setSortDescription(String sortDescription) {
        this.sortDescription = sortDescription;
    }

    public Integer getSortParent() {
        return sortParent;
    }

    public void setSortParent(Integer sortParent) {
        this.sortParent = sortParent;
    }
}
