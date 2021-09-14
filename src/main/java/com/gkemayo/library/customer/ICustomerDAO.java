package com.gkemayo.library.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerDAO extends JpaRepository<Customer, Integer> {
	public Customer findByIsbnIgnoreCase(String isbn);
	
	public List<Customer> findByTitleLikeIgnoreCase(String title);

	public Customer findByEmailIgnoreCase(String email);

	public List<Customer> findByLastNameIgnoreCase(String lastName);

	public Customer findByIdIgnoreCase(Integer id);
}
