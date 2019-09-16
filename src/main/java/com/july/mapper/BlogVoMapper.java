package com.july.mapper;

import java.util.List;

import com.july.po.BlogCustom;


public interface BlogVoMapper {

 	/**
     * 取得每个类别下的前N条记录
     * @param map
     * @return
     */
    List<BlogCustom> selectBlogByAllType();
}
