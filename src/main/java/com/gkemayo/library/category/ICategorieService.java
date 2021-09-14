package com.gkemayo.library.category;

import java.util.List;

public interface ICategorieService {
    public Category saveCategory(Category category);
    
    public Category updateCategory(Category category);
    
    public void deleteCategory(Integer categoryId);
    
    public List<Category> findCategorysByTitleOrPartTitle(String title);
    
    public Category findCategoryByIsbn(String isbn);
    
    public boolean checkIfIdExists(Integer id);
    
}
