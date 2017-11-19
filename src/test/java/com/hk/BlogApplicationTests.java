package com.hk;

import com.hk.blog.dao.ArticleRepository;
import com.hk.blog.domain.Article;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

//	@Before
//	public void insertArticle(){
//		Article article = new Article();
//		article.setAuthor("hkk");
//		article.setTitle("blog");
//		article.setCategoryId(123);
//		article.setContent("博客内容的测试");
//		article.setCreateTime(new Date());
//		article.setModifyTime(new Date());
//		articleRepository.save(article);
//	}

	@Test
	public void getArticleById(){
		List<Article> articles = articleRepository.getArticles(0,2);
		System.out.print(articles.size());

	}


}
