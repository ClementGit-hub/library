package com.gkemayo.library.category;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategorieDAO extends JpaRepository<Category, Integer> {

	public Category findByIsbnIgnoreCase(String isbn);
	
	public List<Category> findByTitleLikeIgnoreCase(String title);

}
