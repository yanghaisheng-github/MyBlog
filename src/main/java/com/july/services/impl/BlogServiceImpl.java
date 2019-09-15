package com.july.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.july.mapper.TBlogMapper;
import com.july.po.TBlog;
import com.july.services.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired 
	private TBlogMapper blogMapper;
	
	@Override
	public Map<String, List<TBlog>> selectBlogByAllType() {

	    Map<String, List<TBlog>> map = new HashMap<>();
	    List<TBlog> list = blogMapper.selectBlogByAllType();
	    for (TBlog blog : list) {
	      if (map.containsKey(blog.getType().getTypename())) {
	        map.get(blog.getType().getTypename()).add(blog);
	      } else {
	        List<TBlog> bList = new ArrayList<>();
	        bList.add(blog);
	        map.put(blog.getType().getTypename(), bList);
	      }
	    }
	    return map;
	  
	}

}
