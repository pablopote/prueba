package com.hibernatemio.hibernatemio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Store;

@Entity
public class Author {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String lacoco;
	private String popo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Field(store = Store.YES)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
