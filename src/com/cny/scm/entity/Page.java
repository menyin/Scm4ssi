package com.cny.scm.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page<T> implements Serializable {
    private Integer startIndex;
    private Integer size;
    private Integer total;
    private List<T> list;
    private String keyword;
    private T serachEntity;
//    private Integer start;//起始记录索引可通过页码算出
    private Map<String,Object> pageMap=new HashMap<>();

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = (startIndex -1)*this.size;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.pageMap.put("total", total);
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.pageMap.put("list", list);
        this.list = list;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = "%"+keyword+"%";
    }

    public T getSerachEntity() {
        return serachEntity;
    }

    public void setSerachEntity(T serachEntity) {
        this.serachEntity = serachEntity;
    }

    public Map<String, Object> getPageMap() {
        return pageMap;
    }

    public void setPageMap(Map<String, Object> pageMap) {
        this.pageMap = pageMap;
    }
}
