package calculator.calculator;

import org.springframework.boot.SpringApplication;

public class TestCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.from(Calc::main).with(TestcontainersConfiguration.class).run(args);
	}

}
