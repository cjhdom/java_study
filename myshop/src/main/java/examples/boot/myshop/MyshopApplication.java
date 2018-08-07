package examples.boot.myshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 컴포너느 스캐너가 이게 위치하고 있는 폴더를 parent로 기준으로 child components를 찾아주기 때문에 지금 여기에 있어야한다
@SpringBootApplication
public class MyshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyshopApplication.class, args);
    }
}
