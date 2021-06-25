package com.cny.scm.dao;

import com.cny.scm.entity.Page;

import java.util.List;

public interface BaseMapper<T> {
    //添加单个对象
    public int insert(T entity);

    //修改单个对象
    public int update(T entity);

    //删除单个对象
    public int delete(T entity);

    //查询单个对象
    public T select(T entity);

    //通过关键字查询分页数据
    public List<T> selectPageList(Page<T> page);
    public Integer getPageTotal(Page<T> page);

    public Integer deleteList(String[] pks);
    }
