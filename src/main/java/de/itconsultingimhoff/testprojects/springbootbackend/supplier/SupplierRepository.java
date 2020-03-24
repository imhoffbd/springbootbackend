package de.itconsultingimhoff.testprojects.springbootbackend.supplier;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SupplierRepository extends MongoRepository<Supplier, String> {

    List<Supplier> findByName(String name);
}