package de.itconsultingimhoff.testprojects.springbootbackend.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(SupplierRepository repository) {
        return args -> {
            Supplier supplier = new Supplier("10201", "Bosch");
            SupplierAddress supplierAddress = new SupplierAddress("102010", "Bosch Feuerbach");
            supplierAddress.setStreet("Porschestr. 20");
            supplierAddress.setZipcode("70376");
            supplierAddress.setCity("Stuttgart");
            supplier.addSupplierAddress(supplierAddress);
            supplierAddress = new SupplierAddress("102011", "Bosch Stuttgart");
            supplierAddress.setStreet("Schlossplatz 15");
            supplierAddress.setZipcode("70100");
            supplierAddress.setCity("Stuttgart");
            supplier.addSupplierAddress(supplierAddress);
            log.info("Preloading " + repository.save(supplier));
            supplier = new Supplier("10202", "ZF");
            supplierAddress = new SupplierAddress("102020", "ZF Friedrichshafen");
            supplierAddress.setStreet("Zeppelinstr. 1");
            supplierAddress.setZipcode("70112");
            supplierAddress.setCity("Friedrichshafen");
            supplier.addSupplierAddress(supplierAddress);
            log.info("Preloading " + repository.save(supplier));
        };
    }
}