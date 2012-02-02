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
	private String brand;
	private Content content;
	private List<Sku> skus;

	//these are optional
	private String url;
	private Map<String, List<String>> imageUrls;
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
	public Map<String, List<String>> getImageUrls() {
		return imageUrls;
	}
	/**
	 * @param imageUrls the imageUrls to set
	 */
	public void setImageUrls(Map<String, List<String>> imageUrls) {
		this.imageUrls = imageUrls;
	}



}
