package com.gkemayo.library.customer;

import java.util.List;

import org.springframework.data.domain.Page;

public interface ICustomerService {
    public Customer saveCustomer(Customer customer);
    
    public Customer updateCustomer(Customer customer);
    
    public void deleteCustomer(Integer customerId);
    
    public List<Customer> findCustomersByTitleOrPartTitle(String title);
    
    public Customer findCustomerByIsbn(String isbn);
    
    public boolean checkIfIdExists(Integer id);

    public Customer findCustomerByEmail(String email);

    public List<Customer> findCustomerByLastName(String lastName);

    public Page<Customer> getPaginatedCustomersList(int beginPage, int endPage);

}
