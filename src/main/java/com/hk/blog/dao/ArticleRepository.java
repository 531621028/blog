package com.hk.blog.dao;

import com.hk.blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kang on 2017/11/18.
 */
public interface ArticleRepository extends JpaRepository<Article, Serializable> {

    Article getArticleById(int id);

    @Query(value = "select * from article limit ?1,?2",nativeQuery = true)
    List<Article> getArticles(int start,int size);

    List<Article> getArticlesByCategoryId(int categoryId);

    List<Article> getArticlesByTagId(int tagId);

    List<Article> getArticlesByAuthor(String author);
}
