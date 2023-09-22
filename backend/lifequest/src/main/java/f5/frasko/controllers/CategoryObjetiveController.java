package f5.frasko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import f5.frasko.models.CategoryObjetive;
import f5.frasko.services.CategoryObjetiveService;

@RestController
@RequestMapping("/categories")
public class CategoryObjetiveController {
    
    @Autowired
    CategoryObjetiveService service;

    @GetMapping
    public List<CategoryObjetive> getAllCategories(){
        return service.getAllCategories();
    }

    @GetMapping("/{id}")
    public CategoryObjetive getCategoryById(@PathVariable Long id){
        return service.getCategoryById(id);
    }
}
