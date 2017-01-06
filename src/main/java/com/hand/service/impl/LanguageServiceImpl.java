package com.hand.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hand.bean.Language;
import com.hand.mapper.LanguageMapper;
import com.hand.service.LanguageService;
@Service("languageService")
public class LanguageServiceImpl implements LanguageService {
	@Resource
	private LanguageMapper languageMapper;
	public List<Language> selectLanguage() {
		return languageMapper.selectLanguage();
	}

}
