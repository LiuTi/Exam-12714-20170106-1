package com.hand.bean;
/**
 * 
 * @author violet
 *
 */
public class Language {
	private Integer Language_id;
	private String name;
	public Integer getLanguage_id() {
		return Language_id;
	}
	public Language setLanguage_id(Integer language_id) {
		Language_id = language_id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Language setName(String name) {
		this.name = name;
		return this;
	}
	
}
