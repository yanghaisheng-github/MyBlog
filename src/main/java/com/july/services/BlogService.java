package com.july.services;

import java.util.List;
import java.util.Map;

import com.july.po.TBlog;

public interface BlogService {

 	/**
     * 取得每个类别下的前N条记录
     * @param map
     * @return
     */
 	Map<String,List<TBlog>> selectBlogByAllType();
}
