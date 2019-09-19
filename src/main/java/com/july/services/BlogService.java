package com.july.services;

import java.util.List;
import java.util.Map;

import com.july.po.BlogCustom;
import com.july.po.BlogVo;


public interface BlogService {

 	/**
     * 取得每个类别下的前N条记录
     * @param map
     * @return
     */
 	Map<String, List<BlogVo>> selectBlogByAllType();
 	
 	/**
 	 * 模糊分页组合查询博客
 	 * @param map
 	 * @return
 	 */
 	List<BlogVo> selectGroupLikeBlogListByPage(Map<String, Object> map);
}
