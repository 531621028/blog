package com.hk.blog.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kang on 2017/11/17.
 */
@Entity
@Table(name = "ARTICLE")
public class Article {

    //文章id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //标题
    @Column(nullable = false)
    private String title;

    //标签id
    private Integer tagId;

    //内容
    @Lob
    private String content;

    //分类id
    private Integer categoryId;

    //摘要
    private String excerpt;

    //作者
    @Column(nullable = false)
    private String author;

    //创建时间
    private Date createTime;

    //修改时间
    private Date modifyTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        modifyTime = modifyTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public static void main(String[] args) {
        System.out.println(new Date());
    }
}
