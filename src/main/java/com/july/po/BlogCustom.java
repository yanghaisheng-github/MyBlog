package com.july.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BlogCustom extends TBlog {

	/** 自增 * Integer id;
    * 博客标题 * String title;
    * 博客简介/摘要 * String introduction;
    String keyword;
   * 封面缩略图等 * String images;
    * 点击量 * Integer clicknum;
   * 评论量 * Integer commentnum;
    * 点赞量 * Integer agreenum
    * 1置顶，0普通 * Integer istop;
    * 博主推荐,1为推荐，0为普通 * Integer isrecommend;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
     Date updatetime;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
     Date addtime;
    * -1为草稿，1为正文 ，2为回收站* Integer status;
    * typeId  与TBlogtype中的id关联
    * 博客内容 * String content;   */

    /** 类别 */
    private TBlogtype type;

	public TBlogtype getType() {
		return type;
	}

	public void setType(TBlogtype type) {
		this.type = type;
	}
}