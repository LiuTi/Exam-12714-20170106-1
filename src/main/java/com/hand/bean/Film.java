package com.hand.bean;

import java.sql.Timestamp;


/**
 * 
 * @author violet
 *
 */
public class Film {
	private Integer film_id;
	private String title;
	private String description;
	private String release_year;
	private Integer language_id;
	private Integer original_language_id;
	private Integer rental_duration;
	private Double rental_rate;
	private Integer length;
	private Double replacement_cost;
	private String rating;
	private String special_features;
	private Timestamp last_update;
	
	private String name;//语言名称
	public Integer getFilm_id() {
		return film_id;
	}
	public Film  setFilm_id(Integer film_id) {
		this.film_id = film_id;
		return this;
	}
	public String getTitle() {
		return title;
	}
	public Film setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public Film  setDescription(String description) {
		this.description = description;
		return this;
	}
	public String getRelease_year() {
		return release_year;
	}
	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}
	public Integer getLanguage_id() {
		return language_id;
	}
	public Film setLanguage_id(Integer language_id) {
		this.language_id = language_id;
		return this;
	}
	public Integer getOriginal_language_id() {
		return original_language_id;
	}
	public void setOriginal_language_id(Integer original_language_id) {
		this.original_language_id = original_language_id;
	}
	public Integer getRental_duration() {
		return rental_duration;
	}
	public void setRental_duration(Integer rental_duration) {
		this.rental_duration = rental_duration;
	}
	public Double getRental_rate() {
		return rental_rate;
	}
	public void setRental_rate(Double rental_rate) {
		this.rental_rate = rental_rate;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Double getReplacement_cost() {
		return replacement_cost;
	}
	public void setReplacement_cost(Double replacement_cost) {
		this.replacement_cost = replacement_cost;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSpecial_features() {
		return special_features;
	}
	public void setSpecial_features(String special_features) {
		this.special_features = special_features;
	}
	public Timestamp getLast_update() {
		return last_update;
	}
	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}
	public String getName() {
		return name;
	}
	public Film setName(String name) {
		this.name = name;
		return this;
	}
	public String toString() {
		return "Film [title=" + title + ", description=" + description
				+ ", name=" + name + "]";
	}
	

}
