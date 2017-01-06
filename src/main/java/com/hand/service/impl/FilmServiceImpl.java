package com.hand.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.hand.bean.Customer;
import com.hand.bean.Film;
import com.hand.bean.Language;
import com.hand.bean.Page;
import com.hand.bean.ResponseData;
import com.hand.mapper.CustomerMapper;
import com.hand.mapper.FilmMapper;
import com.hand.mapper.LanguageMapper;
import com.hand.service.FilmService;

/**
 * 业务实现类
 * @author violet
 *
 */
@Service("filmService")
public class FilmServiceImpl implements FilmService {
	@Resource
	private FilmMapper filmMapper;
	@Resource
	private CustomerMapper customerMapper;
	
	public Customer checkLogin(String first_name){
		return customerMapper.checkLogin(first_name);
	}
	
	public int addFilm(Film film) {
		return filmMapper.addFilm(film);
	}

	public List<Film> findFilmList() {
		return filmMapper.findFilmList();
	}
	public ResponseData<Film> query(Page film) {
        ResponseData<Film> responseData = new ResponseData<>();
        responseData.setRows(filmMapper.findFilmList(film));
        responseData.setTotal(filmMapper.selectCount((Film) film.getEntity()));
        return responseData;
    }
	public int updateFilm(Film film){
		return filmMapper.updateFilm(film);
	}
    public int deleteFilm(Integer film_id){
    	return filmMapper.deleteFilm(film_id);
    }
    
    
}
