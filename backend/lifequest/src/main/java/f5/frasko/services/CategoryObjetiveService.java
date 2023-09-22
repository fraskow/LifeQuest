package f5.frasko.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f5.frasko.models.CategoryObjetive;
import f5.frasko.repositories.CategoryObjetiveRepo;

@Service
public class CategoryObjetiveService {
    
    @Autowired
    CategoryObjetiveRepo repo;

    public List<CategoryObjetive> getAllCategories(){
        return repo.findAll();
    }

    public CategoryObjetive getCategoryById(Long id){
        Optional<CategoryObjetive> opt = repo.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            return null;
        }
    }

}
