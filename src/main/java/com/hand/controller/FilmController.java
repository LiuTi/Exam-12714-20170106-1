package com.hand.controller;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.bean.Film;
import com.hand.bean.Language;
import com.hand.bean.Page;
import com.hand.bean.ResponseData;
import com.hand.service.FilmService;
import com.hand.service.LanguageService;

/**
 * 
 * @author violet
 *
 */
@Controller("filmController")
@RequestMapping("/film")
public class FilmController {
	@Autowired
	private FilmService filmService;
	
	@RequestMapping(path="/loginin",method=RequestMethod.GET)
	@ResponseBody
	public String checkLogin(@RequestParam(name = "first_name", required = false, defaultValue = "") String first_name){
		System.err.println(first_name);
		if((filmService.checkLogin(first_name))==null
				||filmService.checkLogin(first_name).equals("")){
			return "/Exam-12714-20170106-1/error.html";
		}
		return "/Exam-12714-20170106-1/index.html";
	} 
	
	@RequestMapping(path="/list", method=RequestMethod.GET)
	public List<Film> findFilmList(ModelMap map){
		return filmService.findFilmList();
	}
	
	@RequestMapping(path="/add",method=RequestMethod.GET)
	@ResponseBody
	public String addFilm(
			@RequestParam(name = "title", required = false, defaultValue = "") String title,
			@RequestParam(name = "description", required = false, defaultValue = "") String description,
			@RequestParam(name = "language_id", required = false, defaultValue = "1") Integer  language_id) {
		Film film =new Film().setTitle(title).setDescription(description).setLanguage_id(language_id);
		filmService.addFilm(film);
		return "redirect:/index.html";
	}
	
	@RequestMapping(path="",method=RequestMethod.GET)
	@ResponseBody
	public ResponseData<Film> query(
             @RequestParam(name = "page",required = false, defaultValue = "1") int page,
             @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
		Page arg=new Page().setPage(page).setPageSize(pageSize).setEntity(new Film());
		return filmService.query(arg);
	}
	
	
	@RequestMapping(path="/update",method=RequestMethod.GET)
	@ResponseBody
	public String updateFilm(Integer id,
			@RequestParam(name = "title", required = false, defaultValue = "") String title,
			@RequestParam(name = "description", required = false, defaultValue = "") String description,
			@RequestParam(name = "language_id", required = false, defaultValue = "1") Integer  language_id) {
		Film film =new Film().setTitle(title).setDescription(description).setLanguage_id(language_id).setFilm_id(id);
		filmService.updateFilm(film);
		return "redirect:/update.html";
	}
	@RequestMapping(path="/delete",method=RequestMethod.GET)
	public String deleteFilm(Integer id) {
		try {
			filmService.deleteFilm(id);
		} catch (Exception e) {
			return "redirect:/delError.html";
		}
		return "redirect:/index.html";
	}
}
