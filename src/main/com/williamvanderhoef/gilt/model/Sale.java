package com.williamvanderhoef.gilt.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Sale implements Serializable
{
	/** */
	private static final long serialVersionUID = -1692215417533345107L;


	//these are guaranteed for each sale
	private String name;
	private String sale;
	private String saleUrl;
	private String saleKey;
	private String store;

	private Map<String, List<Image>> imageUrls;
	private String begins;

	//these are optional
	private String ends;
	private String description;

	//present if query includes product_detail=true and sale is active
	private List<String> products;

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
	public Map<String, List<Image>> getImageUrls() {
		return imageUrls;
	}

	/**
	 * @param imageUrls the imageUrls to set
	 */
	public void setImageUrls(Map<String, List<Image>> imageUrls) {
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
	public List<String> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<String> products) {
		this.products = products;
	}

	/**
	 * @return the store
	 */
	public String getStore() {
		return store;
	}

	/**
	 * @param store the store to set
	 */
	public void setStore(String store) {
		this.store = store;
	}

	/**
	 * @return the sale
	 */
	public String getSale() {
		return sale;
	}

	/**
	 * @param sale the sale to set
	 */
	public void setSale(String sale) {
		this.sale = sale;
	}

	/**
	 * @return the saleKey
	 */
	public String getSaleKey() {
		return saleKey;
	}

	/**
	 * @param saleKey the saleKey to set
	 */
	public void setSaleKey(String saleKey) {
		this.saleKey = saleKey;
	}
}
