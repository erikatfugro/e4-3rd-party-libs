package com.fugro.lab.domain.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.fugro.lab.domain.powermockexample.PowerMockExampleTest;
import com.fugro.lab.domain.util.TranslationsTest;

@RunWith(Suite.class)
//@formatter:off

@Suite.SuiteClasses({
	PowerMockExampleTest.class,
	TranslationsTest.class,
})

//@formatter:on
public class UnitTests
{
}
