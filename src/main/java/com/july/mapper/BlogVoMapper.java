package com.july.mapper;

import java.util.List;

import com.july.po.BlogTypeCustom;
import com.july.po.BlogVo;


public interface BlogVoMapper {

 	/**
     * 取得每个类别下的前N条记录
     * @param map
     * @return
     */
    List<BlogVo> selectBlogByAllType();
    
    /**
     * 根据id获取类别
     * @param id    类别，与TBlog中的typeId关联
     * @return
     */
    BlogTypeCustom selectBlogTypeById(int id);
}
