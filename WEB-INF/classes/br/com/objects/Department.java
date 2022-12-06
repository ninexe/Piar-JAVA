package br.com.objects;

import java.io.Serializable;

public class Department implements Serializable
{
	private static final long serialVersionUID=1L;
	
	private int id;
	private String description;
	private int idCompanyUnit;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getIdCompanyUnit() {
		return idCompanyUnit;
	}
	
	public void setIdCompanyUnit(int idCompanyUnit) {
		this.idCompanyUnit = idCompanyUnit;
	}
}