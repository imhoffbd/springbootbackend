package de.itconsultingimhoff.testprojects.springbootbackend;

import de.itconsultingimhoff.testprojects.springbootbackend.supplier.SupplierController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringbootbackendApplicationTests {

    @Autowired
    private SupplierController supplierController;

    @Test
    void contextLoads() {
        assertThat(supplierController).isNotNull();
    }
}
