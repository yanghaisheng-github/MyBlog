package com.july.mapper;

import java.util.List;
import java.util.Map;

import com.july.po.BlogCustom;
import com.july.po.BlogTypeCustom;
import com.july.po.BlogVo;


public interface BlogVoMapper {

    /**
     * 根据id获取类别
     * @param id    类别，与TBlog中的typeId关联
     * @return
     */
    BlogTypeCustom selectBlogTypeById(int id);
    
 	/**
     * 取得每个类别下的前N条记录
     * @param map
     * @return
     */
    List<BlogVo> selectBlogByAllType();
    
 	/**
 	 * 模糊分页组合查询博客 (不含内容)
 	 * @param map
 	 * @return
 	 */
 	List<BlogVo> selectGroupLikeBlogListByPage(Map<String, Object> map);
}
