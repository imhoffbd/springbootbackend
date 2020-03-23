package de.itconsultingimhoff.testprojects.springbootbackend.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "supplierAddress", path = "supplierAddress")
interface SupplierAddressRepository extends JpaRepository<SupplierAddress, String> {

    List<SupplierAddress> findByName(@Param("name") String name);
}