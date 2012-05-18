package com.williamvanderhoef.gilt.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 *
 */
public class Product implements Serializable
{
	/**
	 *
	 */
	private static final long serialVersionUID = 44331491353480162L;


	//these are guaranteed
	private String name;
	private String product;	//url via the api for this product
	private Number id;		//unique id for this product
	private String brand;
	private String url;    
	private Map<String, List<Image>> imageUrls;
	private List<Sku> skus;
	private List<String> categories;
	
	//these are optional
	private Content content;


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
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the content
	 */
	public Content getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(Content content) {
		this.content = content;
	}
	/**
	 * @return the skus
	 */
	public List<Sku> getSkus() {
		return skus;
	}
	/**
	 * @param skus the skus to set
	 */
	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
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
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}
	/**
	 * @return the id
	 */
	public Number getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Number id) {
		this.id = id;
	}
	/**
	 * @return the categories
	 */
	public List<String> getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
}
