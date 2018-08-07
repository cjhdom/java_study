package daebaksong.org.firstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		// java config class을 첫번째 인자로 넣는다.
		SpringApplication.run(FirstProjectApplication.class, args);
	}
}
