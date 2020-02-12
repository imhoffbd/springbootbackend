package de.itconsultingimhoff.testprojects.springbootbackend.data;

import org.springframework.data.jpa.repository.JpaRepository;

interface SupplierRepository extends JpaRepository<Supplier, String> {

}