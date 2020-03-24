package de.itconsultingimhoff.testprojects.springbootbackend.supplier;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    private SupplierRepository supplierRepository;

    public SupplierController(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @GetMapping
    public List<Supplier> getSuppliers() {
        return supplierRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Supplier> getSupplier(@PathVariable String id) {
        return supplierRepository.findById(id)
                .map(supplier -> ResponseEntity.ok().body(supplier))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
