package com.july.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.july.po.BlogCustom;
import com.july.services.BlogService;

@Controller
public class BlogController {

	@Resource(name = "blogServiceImpl")
	private BlogService blogService;
	
	 /**
     * 模糊组合分页查询博客信息(and)
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/selectBlogByAllType")
    @ResponseBody
    public Map<String, Object> selectBlogByAllType() throws Exception{
        Map<String,List<BlogCustom>> blogMap=blogService.selectBlogByAllType();
        Map<String, Object> returnMap=new HashMap<String, Object>();
        if(blogMap.size()>0){
            returnMap.put("status", 200);
        }else{
            //500表示：返回值为Null
            returnMap.put("status", 500);
        }
        returnMap.put("blogMap", blogMap);
        return returnMap;
    }
}
