package de.itconsultingimhoff.testprojects.springbootbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootbackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootbackendApplication.class, args);
    }

}
