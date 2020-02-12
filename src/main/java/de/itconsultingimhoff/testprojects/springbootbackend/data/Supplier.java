package de.itconsultingimhoff.testprojects.springbootbackend.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
class Supplier {

    private @Id
    String supplierId;
    private String name;

    public Supplier() {
    }

    public Supplier(String supplierId, String name) {
        this.supplierId = supplierId;
        this.name = name;
    }
}