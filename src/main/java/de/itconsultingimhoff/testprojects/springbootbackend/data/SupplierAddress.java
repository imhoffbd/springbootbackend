package de.itconsultingimhoff.testprojects.springbootbackend.data;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "supplier_address")
class SupplierAddress {

    @Id
    private String supplierAddressId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    private Supplier supplier;

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