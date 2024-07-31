package calculator.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.StatusResultMatchersExtensionsKt.isEqualTo;
import static sun.nio.cs.Surrogate.is;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class CalculatorApplicationTests {
	@Autowired
	Calc calculadora;
	@Test
	void contextLoads() {
	}

	@Test
	void testAdd(){
		assertTrue(calculadora.add(3, 4) == 7);
	}

	void testSub1(){
		assertTrue(calculadora.sub(4, 3) == 1);
	}

	void testSub2(){
		assertTrue(calculadora.sub(3, 4) == -1);
	}

}
