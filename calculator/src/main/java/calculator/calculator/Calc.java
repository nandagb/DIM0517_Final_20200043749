package calculator.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calc {

	public static void main(String[] args) {
		SpringApplication.run(Calc.class, args);
	}

	public Integer add(Integer a, Integer b){
		return a+b;
	}

}
