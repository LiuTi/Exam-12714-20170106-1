package com.hand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.bean.Language;
import com.hand.service.LanguageService;
@Controller("languageController")
@RequestMapping("/lan")
public class LanguageController {
	@Autowired
	private LanguageService languageService;
	@RequestMapping(path="/selectLanguage",method=RequestMethod.GET)
	@ResponseBody
	public List<Language> selectLanguage(){
		return languageService.selectLanguage();//所有语言
	}
}
