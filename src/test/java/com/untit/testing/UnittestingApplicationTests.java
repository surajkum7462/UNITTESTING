package com.untit.testing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnittestingApplicationTests {

	private Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum()
	{
		int exp=6;
		int actualRes=calculator.doSum(2,1,3);
//		Assertions.assertEquals(exp,actualRes);
		Assertions.assertThat(actualRes).isEqualTo(exp);
		System.out.println("Test passed 1");
//		Assertions.assertThat(actualRes).isEqualTo(7);
	}

	@Test
	void testProduct()
	{
		// expected
		int exp=6;
		// actual
		int actual=calculator.doProduct(2,3);
		Assertions.assertThat(actual).isEqualTo(exp);
		System.out.println("Test passed 2");

	}

	// compare

	@Test
	void testCompareNums()
	{
		Boolean actual=calculator.compareTwoNums(2,2);
		Assertions.assertThat(actual).isTrue();
		System.out.println("Test passed 3");
	}

}
