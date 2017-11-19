package com.hk.blog.controller;

import com.hk.blog.domain.Article;
import com.hk.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kang on 2017/11/16.
 */
@Controller
@RequestMapping("blog")
public class BlogController {
//    @Value("${com.name}")
//    public String name;
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model){
        model.addAttribute("name","531621028");
        List<Article> articles = articleService.getArticles(0,10);
        model.addAttribute("articles",articles);
        return "index";
    }

    @RequestMapping("/name")
    @ResponseBody
    public Map<String,String> name(HttpServletRequest request){
        Map<String,String> result = new HashMap<>();
        result.put("name","531621028");
        result.put("sex","男");
        result.put("age","25");
        return result;
    }
}
