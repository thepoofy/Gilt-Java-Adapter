package com.williamvanderhoef.gilt.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 */
public class Sale implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1692215417533345107L;
	
	
	//these are guaranteed for each sale
	private String name;
	private String saleUrl;
	private List<String> imageUrls;
	private String begins;

	//these are optional
	private String ends;
	private String description;

	//present if query includes product_detail=true and sale is active
	private List<Product> products;

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
	 * @return the saleUrl
	 */
	public String getSaleUrl() {
		return saleUrl;
	}

	/**
	 * @param saleUrl the saleUrl to set
	 */
	public void setSaleUrl(String saleUrl) {
		this.saleUrl = saleUrl;
	}

	/**
	 * @return the imageUrls
	 */
	public List<String> getImageUrls() {
		return imageUrls;
	}

	/**
	 * @param imageUrls the imageUrls to set
	 */
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	/**
	 * @return the begins
	 */
	public String getBegins() {
		return begins;
	}

	/**
	 * @param begins the begins to set
	 */
	public void setBegins(String begins) {
		this.begins = begins;
	}

	/**
	 * @return the ends
	 */
	public String getEnds() {
		return ends;
	}

	/**
	 * @param ends the ends to set
	 */
	public void setEnds(String ends) {
		this.ends = ends;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}




}
