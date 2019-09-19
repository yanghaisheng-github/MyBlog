package com.july.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.july.po.BlogCustom;
import com.july.po.BlogVo;
import com.july.services.BlogService;


@Controller
public class HomePageController {

	@Resource(name = "blogServiceImpl")
	private BlogService blogService;
	
	 /**
     * 模糊组合分页查询博客信息(and)
     * @param id
     * @return  知识总结、网站开发、Java基础、设计模式、面试分享
     * @throws Exception
     */
    @RequestMapping(value = "/selectBlogByEachType")
    @ResponseBody
    public Map<String, Object> selectBlogByEachType() throws Exception{
        Map<String,List<BlogVo>> blogMap=blogService.selectBlogByAllType();
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
    
	 /**
	  * 模糊组合分页查询博客信息(and)
	  * @param id
	  * @return   热门文章、特别推荐、最新文章、点击排行
	  * @throws Exception
	  */
	 @RequestMapping(value = "/selectGroupLikeBlogListByPage")
	 @ResponseBody
	 public Map<String, Object> selectGroupLikeBlogListByPage(BlogCustom blog,@RequestParam(value="sort", required=true,defaultValue="addTime") String sort,@RequestParam(value="page", required=true,defaultValue="1") Integer page,@RequestParam(value="pageSize", required=true,defaultValue="10") Integer pageSize) throws Exception{
		 Map<String, Object> map=new HashMap<String, Object>();
		 map.put("sort", sort);
		 if(blog.getTitle()!=null&&blog.getTitle()!=""){
			 map.put("title", blog.getTitle());
		 }
		 if(blog.getIntroduction()!=null&&blog.getIntroduction()!=""){
			 map.put("introduction", blog.getIntroduction());
		 }
		 if(blog.getKeyword()!=null&&blog.getKeyword()!=""){
			 map.put("keyword", blog.getKeyword());
		 }
		 if(blog.getContent()!=null&&blog.getContent()!=""){
			 map.put("content", blog.getContent());
		 }
		 if(blog.getIstop()!=null){
			 map.put("isTop", blog.getIstop());
		 }
		 if(blog.getType()!=null){
			 map.put("type_id", blog.getType().getId());
		 }
		 map.put("status", 1);
		 if(blog.getStatus()!=null){
			 map.put("status", blog.getStatus());
		 }
		 if(blog.getIsrecommend()!=null){
			 map.put("isRecommend", blog.getIsrecommend());
		 }
		 if(blog.getAddtime()!=null){
			 map.put("addTime", blog.getAddtime());
		 }
		 //分页显示：第page页开始，每页显示pageSize条记录
		 PageHelper.startPage(page, pageSize);
		 List<BlogVo> blogList=blogService.selectGroupLikeBlogListByPage(map);
		 PageInfo<BlogVo> pageInfo=new PageInfo<BlogVo>(blogList);
		 Map<String, Object> returnMap=new HashMap<String, Object>();
		 if(blogList.size()>0){
			 returnMap.put("status", 200);
		 }else{
			 //500表示：返回值为Null
			 returnMap.put("status", 500);
		 }
		 returnMap.put("blogList", blogList);
		 returnMap.put("pageInfo", pageInfo);
		 return returnMap;
	 }
	 
}
