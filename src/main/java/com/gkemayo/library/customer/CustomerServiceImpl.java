package com.gkemayo.library.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private ICustomerDAO customerDao;
    
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		customerDao.deleteById(customerId);
	}

	@Override
	public List<Customer> findCustomersByTitleOrPartTitle(String title) {
		return customerDao.findByTitleLikeIgnoreCase((new StringBuilder()).append("%").append(title).append("%").toString());
	}

	@Override
	public Customer findCustomerByIsbn(String isbn) {
        return customerDao.findByIsbnIgnoreCase(isbn);
	}

	@Override
	public boolean checkIfIdExists(Integer id) {
        return customerDao.existsById(id);
	}

	@Override
	public Customer findCustomerByEmail(String email) {
        return customerDao.findByEmailIgnoreCase(email);
	}

	@Override
	public List<Customer> findCustomerByLastName(String lastName) {
		return customerDao.findByLastNameIgnoreCase(lastName);
	}

	@Override
	public Page<Customer> getPaginatedCustomersList(int beginPage, int endPage) {
//		return customerDao.findByLastNameIgnoreCase(lastName); ???
		return null;
	}

	public Customer findCustomerById(Integer id) {
        return customerDao.findByIdIgnoreCase(id);
	}

}
