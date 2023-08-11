package escolati7.controleparental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("escolati7.controleparental.model")
public class ControleParentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleParentalApplication.class, args);
	}

}
