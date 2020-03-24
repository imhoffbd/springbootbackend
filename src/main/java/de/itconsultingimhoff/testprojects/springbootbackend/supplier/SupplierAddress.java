package de.itconsultingimhoff.testprojects.springbootbackend.supplier;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "supplierAddress")
public class SupplierAddress {

    @Id
    private String supplierAddressId;

    @Indexed
    private String name;

    private String street;
    private String zipcode;
    private String city;

    private String email;

    public SupplierAddress() {
    }

    public SupplierAddress(String supplierAddressId, String name) {
        this.supplierAddressId = supplierAddressId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SupplierAddress)) return false;
        return supplierAddressId != null && supplierAddressId.equals(((SupplierAddress) o).getSupplierAddressId());
    }

    @Override
    public int hashCode() {
        return SupplierAddress.class.hashCode();
    }
}