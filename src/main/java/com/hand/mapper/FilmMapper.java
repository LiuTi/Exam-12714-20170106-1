package com.hand.mapper;


import java.util.List;

import org.springframework.stereotype.Component;

import com.hand.bean.Film;
import com.hand.bean.Page;

/**
 * 
 * @author violet
 *
 */

public interface FilmMapper {
	public int addFilm(Film film);
	public List<Film> findFilmList();
	public List<Film> findFilmList(Page<Film> bean); 
    public int selectCount(Film film);
    public int updateFilm(Film film);
    public int deleteFilm(Integer film_id);
}
