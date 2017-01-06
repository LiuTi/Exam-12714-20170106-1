package com.hand.service;

import java.util.List;

import com.hand.bean.Customer;
import com.hand.bean.Film;
import com.hand.bean.Language;
import com.hand.bean.Page;
import com.hand.bean.ResponseData;


/**
 * 
 * @author violet
 *
 */
public interface FilmService {
	/**
	 * 新增
	 * @param film
	 * @return
	 */
	public int addFilm(Film film);
	/**
	 * 查询
	 * @return
	 */
	public List<Film> findFilmList(); 
	public ResponseData<Film> query(Page film);
	public int updateFilm(Film film);
    public int deleteFilm(Integer film_id);
    public Customer checkLogin(String first_name);
}
