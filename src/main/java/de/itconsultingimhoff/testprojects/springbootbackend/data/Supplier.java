package de.itconsultingimhoff.testprojects.springbootbackend.data;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "supplier")
class Supplier {

    @Id
    private String supplierId;

    @OneToMany(
            mappedBy = "supplier",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SupplierAddress> supplierAddresses = new ArrayList<>();

    private String name;

    public Supplier() {
    }

    public Supplier(String supplierId, String name) {
        this.supplierId = supplierId;
        this.name = name;
    }

    public void addSupplierAddress(SupplierAddress supplierAddress) {
        supplierAddresses.add(supplierAddress);
        supplierAddress.setSupplier(this);
    }

    public void removeSupplierAddress(SupplierAddress supplierAddress) {
        supplierAddresses.remove(supplierAddress);
        supplierAddress.setSupplier(null);
    }
}
