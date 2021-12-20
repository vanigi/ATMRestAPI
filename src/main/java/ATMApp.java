/**
 * Spring boot RESTApi demo project for ADP
 * @author Iovani Juarez Garcia C.E.
 * @date December 2021
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.adp.demo.*")
public class ATMApp {
    public static void main(String[] args) {
        SpringApplication.run(ATMApp.class);
    }
}
