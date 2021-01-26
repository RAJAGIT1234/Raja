package com.nt.bo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class BaseBean {

	
	private int id;
	private String name;
	private LocalDateTime doj;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getDoj() {
		return doj;
	}
	public void setDoj(LocalDateTime doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "BaseBean [id=" + id + ", name=" + name + ", doj=" + doj + "]";
	}
	
	
	
	
	
}
