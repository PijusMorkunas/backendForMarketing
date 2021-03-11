package controllers;

import entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import services.CategoryService;
@Controller

public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/saveAdvert")
    public String saveAdvert(Category category){
        categoryService.save(category);
        return "redirect:/home";
    }
}
