package de.itconsultingimhoff.testprojects.springbootbackend.supplier;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "supplier")
public class Supplier {

    @Id
    private String supplierId;

    private List<SupplierAddress> supplierAddresses = new ArrayList<>();

    @Indexed
    private String name;

    public Supplier() {
    }

    public Supplier(String supplierId, String name) {
        this.supplierId = supplierId;
        this.name = name;
    }

    public void addSupplierAddress(SupplierAddress supplierAddress) {
        supplierAddresses.add(supplierAddress);
    }

    public void removeSupplierAddress(SupplierAddress supplierAddress) {
        supplierAddresses.remove(supplierAddress);
    }
}
