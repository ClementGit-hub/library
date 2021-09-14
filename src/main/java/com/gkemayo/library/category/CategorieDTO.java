package com.gkemayo.library.category;

import java.time.LocalDate;

public class CategorieDTO {
	Integer categorieId;
	LocalDate beginDate;
	LocalDate endDate;
	
	public Integer getCategorieId() {
		return categorieId;
	}
	public void setCategorieId(Integer categorieId) {
		this.categorieId = categorieId;
	}
	public LocalDate getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
}
