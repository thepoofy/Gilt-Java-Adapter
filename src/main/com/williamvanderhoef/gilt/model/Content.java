package com.williamvanderhoef.gilt.model;

import java.io.Serializable;

/**
 *
 *
 */
public class Content implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 7650507357536847400L;

	private String description;
	private String fitNotes;
	private String material;
	private String careInstructions;
	private String origin;

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
	 * @return the fitNotes
	 */
	public String getFitNotes() {
		return fitNotes;
	}
	/**
	 * @param fitNotes the fitNotes to set
	 */
	public void setFitNotes(String fitNotes) {
		this.fitNotes = fitNotes;
	}
	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}
	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the careInstructions
	 */
	public String getCareInstructions() {
		return careInstructions;
	}
	/**
	 * @param careInstructions the careInstructions to set
	 */
	public void setCareInstructions(String careInstructions) {
		this.careInstructions = careInstructions;
	}


}
