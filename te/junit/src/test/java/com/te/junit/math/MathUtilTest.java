package com.te.junit.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

@EnabledOnJre(JRE.JAVA_8)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilTest {

	private MathUtil math = null;

	@BeforeEach
	public void name() {
		math = new MathUtil();
	}

	@Test
	@DisplayName("demo")
	void testAdd() {
		
		int exp = 12;
		int act = math.add(5, 5);
		
		assertEquals(exp, act, "this was demo example");
	}
//
//	@RepeatedTest(5)
//	@Disabled
//	void divideTest() {
//		assertThrows(ArithmeticException.class, () -> math.divide(10, 0), "divide by zero");
//	}

//	@Test
//	@DisplayName("Add emp method")
//	void addEmpTest() {
////		assertEquals(true, math.addEmp(1000, "sai") ," did not work");
//	}
//	
//	
//	
//	@Test
//	@RepeatedTest(3)
//	@DisplayName("remove emp method")
//	void deleteTest(RepetitionInfo info) {
//		System.out.println(info.getCurrentRepetition());
////		assertEquals(true, math.remove(1000) ," did not work");
//		assertThrows(ArithmeticException.class, () -> math.divide(10, 0), "divide by zero");
//	}
	
	
	
	
	
	
	
}
