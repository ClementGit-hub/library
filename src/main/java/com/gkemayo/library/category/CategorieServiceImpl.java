package com.gkemayo.library.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("categoryService")
@Transactional
public class CategorieServiceImpl implements ICategorieService {

    @Autowired
    private ICategorieDAO categoryDao;
	
	@Override
	public Category saveCategory(Category category) {
        return categoryDao.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryDao.save(category);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		categoryDao.deleteById(categoryId);
	}

	@Override
	public List<Category> findCategorysByTitleOrPartTitle(String title) {
        return categoryDao.findByTitleLikeIgnoreCase((new StringBuilder()).append("%").append(title).append("%").toString());
	}

	@Override
	public Category findCategoryByIsbn(String isbn) {
        return categoryDao.findByIsbnIgnoreCase(isbn);
	}

	@Override
	public boolean checkIfIdExists(Integer id) {
        return categoryDao.existsById(id);
	}

}
