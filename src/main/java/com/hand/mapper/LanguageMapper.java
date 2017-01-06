package com.hand.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hand.bean.Language;

/**
 * 
 * @author violet
 *
 */
@Component
public interface LanguageMapper {
	public List<Language> selectLanguage();
}
