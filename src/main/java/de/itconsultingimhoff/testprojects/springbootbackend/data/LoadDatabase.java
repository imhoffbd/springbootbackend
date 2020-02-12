package de.itconsultingimhoff.testprojects.springbootbackend.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    //    @Bean
    CommandLineRunner initDatabase(SupplierRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Supplier("10201", "Bosch")));
            log.info("Preloading " + repository.save(new Supplier("10202", "ZF")));
        };
    }
}