package com.williamvanderhoef.gilt.model;

import java.util.List;

/**
 *
 *
 */
public class Sku {

	private String msrpPrice;
	private String salePrice;

	//optional
	private String shippingSurcharge;
	private List<Attribute> attributes;
	/**
	 * @return the msrpPrice
	 */
	public String getMsrpPrice() {
		return msrpPrice;
	}
	/**
	 * @param msrpPrice the msrpPrice to set
	 */
	public void setMsrpPrice(String msrpPrice) {
		this.msrpPrice = msrpPrice;
	}
	/**
	 * @return the salePrice
	 */
	public String getSalePrice() {
		return salePrice;
	}
	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}
	/**
	 * @return the shippingSurcharge
	 */
	public String getShippingSurcharge() {
		return shippingSurcharge;
	}
	/**
	 * @param shippingSurcharge the shippingSurcharge to set
	 */
	public void setShippingSurcharge(String shippingSurcharge) {
		this.shippingSurcharge = shippingSurcharge;
	}
	/**
	 * @return the attributes
	 */
	public List<Attribute> getAttributes() {
		return attributes;
	}
	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}


}
