package com.promineotech;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



class TestDemoJunitTest {
	
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJunitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
	
		//Given: two positive numbers are added correctly
		
		
		//When: the method to check the result is called
		if(!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		
		
		//Then: The result is returned
		
		//When: If result is false
		
		//Then: result is the same, exception thrown
		} else {
			
			assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}
		}
		@Test
		void assertThatNumberSquaredIsCorrect() {
			
			TestDemo mockDemo = spy(testDemo);
			doReturn(5).when(mockDemo).getRandomInt();
			
			
			int fiveSquared = mockDemo.randomNumberSquared();
			
			assertThat(fiveSquared).isEqualTo(25);
		
	
}
	static Stream <Arguments> argumentsForAddPositive() {
		//@formatter: off
	return Stream.of(
					arguments(2, 4, 6, false)
			);
			//@formatter: on
	}
	@Test
	void assertThatPairsOfPPositiveNumbersAreAddedCorrectly() {
		
		
		
	
assertThat(testDemo.addPositive(4, 5)).isEqualTo(9);
assertThat(testDemo.addPositive(40, 50)).isEqualTo(90);
}
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJunitTest#argumentsForAddition")
	void assertThatNumbersAreAdded(int a, int b, int expected, boolean exception ) {
		
		
		if(!exception) {
			
			assertThat(testDemo.addNegativeAndPositive(a, b)).isEqualTo(expected);
			
		} else {
			
			assertThatThrownBy(() -> testDemo.addNegativeAndPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}
	}
		static Stream <Arguments> argumentsForAddition() {
			return Stream.of(
					arguments(-2,-4,-6, true)
					
					
					
					);
		}	

}

