package com.july.po;

import java.util.Date;

public class TResource {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.id
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.title
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.content
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.link
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    private String link;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.password
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.addTime
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    private Date addtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.status
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.id
     *
     * @return the value of t_resource.id
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.id
     *
     * @param id the value for t_resource.id
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.title
     *
     * @return the value of t_resource.title
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.title
     *
     * @param title the value for t_resource.title
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.content
     *
     * @return the value of t_resource.content
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.content
     *
     * @param content the value for t_resource.content
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.link
     *
     * @return the value of t_resource.link
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public String getLink() {
        return link;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.link
     *
     * @param link the value for t_resource.link
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.password
     *
     * @return the value of t_resource.password
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.password
     *
     * @param password the value for t_resource.password
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.addTime
     *
     * @return the value of t_resource.addTime
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.addTime
     *
     * @param addtime the value for t_resource.addTime
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.status
     *
     * @return the value of t_resource.status
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.status
     *
     * @param status the value for t_resource.status
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}