package com.july.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.july.mapper.BlogVoMapper;
import com.july.po.BlogCustom;
import com.july.po.BlogVo;
import com.july.services.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired 
	private BlogVoMapper blogMapper;
	
	@Override
	public Map<String, List<BlogVo>> selectBlogByAllType() {

	    Map<String, List<BlogVo>> map = new HashMap<>();
	    List<BlogVo> list = blogMapper.selectBlogByAllType();
	    for (BlogVo blogVo : list) {
	      if (map.containsKey(blogVo.getBlogTypeCustom().getTypename())) {
	        map.get(blogVo.getBlogTypeCustom().getTypename()).add(blogVo);
	      } else {
	        List<BlogVo> bList = new ArrayList<>();
	        bList.add(blogVo);
	        map.put(blogVo.getBlogTypeCustom().getTypename(), bList);
	      }
	    }
	    return map;
	  
	}

	@Override
	public List<BlogVo> selectGroupLikeBlogListByPage(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return blogMapper.selectGroupLikeBlogListByPage(map);
	}

}
