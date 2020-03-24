package de.itconsultingimhoff.testprojects.springbootbackend.supplier;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

interface SupplierAddressRepository extends MongoRepository<SupplierAddress, String> {

    List<SupplierAddress> findByName(String name);
}