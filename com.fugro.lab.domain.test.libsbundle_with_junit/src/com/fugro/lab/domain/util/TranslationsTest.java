package com.fugro.lab.domain.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TranslationsTest
{
	@Test
	public void translated()
	{
		assertThat(Translations.INSTANCE.translate("UNIT_WEIGHT_SYMBOL")).isEqualTo("uw");
	}
	
	@Test
	public void untranslated()
	{
		assertThat(Translations.INSTANCE.translate("untranslated")).isEqualTo("untranslated");
	}
}
