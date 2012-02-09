package com.williamvanderhoef.gilt.model;

import java.io.Serializable;

/**
 *
 * @author wvanderhoef
 *
 */
public class Image implements Serializable {

	/** */
	private static final long serialVersionUID = 1171337182706141839L;


	private Number height;
	private Number width;
	private String url;
	/**
	 * @return the height
	 */
	public Number getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Number height) {
		this.height = height;
	}
	/**
	 * @return the width
	 */
	public Number getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(Number width) {
		this.width = width;
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


}
