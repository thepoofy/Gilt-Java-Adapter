package com.williamvanderhoef.gilt.model;

import java.io.Serializable;

/**
 *
 */
public class Attribute implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1963257685901321886L;
	
	
	private String name;
	private String value;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
