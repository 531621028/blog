package com.hk.blog.service;

import com.hk.blog.dao.ArticleRepository;
import com.hk.blog.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kang on 2017/11/18.
 */
@Service
@Transactional
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Article getArticleById(int id) {
        return articleRepository.getArticleById(id);
    }

    public List<Article> getArticles(int start, int size) {
        return articleRepository.getArticles(start, size);
    }
}
