package com.july.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.july.mapper.BlogVoMapper;
import com.july.po.BlogCustom;
import com.july.services.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired 
	private BlogVoMapper blogMapper;
	
	@Override
	public Map<String, List<BlogCustom>> selectBlogByAllType() {

	    Map<String, List<BlogCustom>> map = new HashMap<>();
	    List<BlogCustom> list = blogMapper.selectBlogByAllType();
	    for (BlogCustom blog : list) {
	      if (map.containsKey(blog.getType().getTypename())) {
	        map.get(blog.getType().getTypename()).add(blog);
	      } else {
	        List<BlogCustom> bList = new ArrayList<>();
	        bList.add(blog);
	        map.put(blog.getType().getTypename(), bList);
	      }
	    }
	    return map;
	  
	}

}
