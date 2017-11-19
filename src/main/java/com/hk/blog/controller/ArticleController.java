package com.hk.blog.controller;

import com.hk.blog.domain.Article;
import com.hk.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kang on 2017/11/18.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("details")
    public String details(HttpServletRequest request, Model model){
        model.addAttribute("name","531621028");
        int id = Integer.parseInt(request.getParameter("id"));
        Article article = articleService.getArticleById(id);
        System.out.println(article.getTitle());
        return "details";
    }
}
