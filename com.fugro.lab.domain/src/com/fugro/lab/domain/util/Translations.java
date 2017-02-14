package com.fugro.lab.domain.util;

import java.util.HashMap;
import java.util.Map;

public enum Translations
{
	INSTANCE;

	private static Map<String, String> termToTranslation = new HashMap<>();

	static
	{
		termToTranslation.put("UNIT_WEIGHT_SYMBOL", "uw");
	}

	public String translate(String term)
	{
		String translation = termToTranslation.get(term);
		if (translation!=null)
		{
			return translation;
		}
		return term;
	}
}
