package com.fugro.lab.domain.powermockexample;

import static org.assertj.core.api.Assertions.*;
import static org.powermock.api.mockito.PowerMockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ StaticClass.class, ClassWithPrivateMethod.class })
public class PowerMockExampleTest
{
	@Test
	public void testStaticClasss()
	{
		// Given
		mockStatic(StaticClass.class);
		when(StaticClass.getValue()).thenReturn("MockedValue");

		// When
		String value = StaticClass.getValue();

		// Then
		assertThat(value).isEqualTo("MockedValue");
	}

	@Test
	public void testClassWithPrivateMethod() throws Exception
	{
		// Given
		ClassWithPrivateMethod classWithPrivateMethod = spy(new ClassWithPrivateMethod());
		when(classWithPrivateMethod, "getValuePrivate").thenReturn("MockedValue");

		// When
		String value = classWithPrivateMethod.getValue();

		// Then
		assertThat(value).isEqualTo("MockedValue");
	}
}
