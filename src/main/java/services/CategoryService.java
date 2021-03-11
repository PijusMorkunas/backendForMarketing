package services;

import entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> listAll() {
        return categoryRepository.findAll();
    }
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
    public Category get(Long id) {
        return categoryRepository.findById(id).get();
    }
    public void save(Category category){
        categoryRepository.save(category);
    }
}
