package com.gkemayo.library.loan;

import java.time.LocalDate;

import com.gkemayo.library.book.Book;
import com.gkemayo.library.customer.Customer;

public class LoanDTO {
	
	Integer loanId;
	LocalDate loanBeginDate;
	LocalDate loanEndDate;

	public Book getBookDTO() {
		return new Book();
	}

	public Customer getCustomerDTO() {
		return new Customer();
	}
	

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public LocalDate getLoanBeginDate() {
		return loanBeginDate;
	}

	public void setLoanBeginDate(LocalDate loanBeginDate) {
		this.loanBeginDate = loanBeginDate;
	}

	public LocalDate getLoanEndDate() {
		return loanEndDate;
	}

	public void setLoanEndDate(LocalDate loanEndDate) {
		this.loanEndDate = loanEndDate;
	}

}
