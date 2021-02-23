package fi.vamk.e1900315.sadnorthwind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuppliersController {
    @Autowired
    private SuppliersRepository SuppliersRepo;
    @GetMapping("/suppliers/")
    private Iterable<Suppliers> getSuppliers() {
        return SuppliersRepo.findAll();
    }
    @GetMapping("/suppliers/{id}/")
    private Suppliers getSuppliersById(@PathVariable("id") Integer id) {
        return SuppliersRepo.findById(id).get();
    }
    @PostMapping("/suppliers/")
    private Suppliers addSuppliers(@RequestBody Suppliers newSuppliers) {
        return SuppliersRepo.save(newSuppliers);
    }
    @DeleteMapping("/suppliers/{id}/")
    private void deleteSuppliers(@PathVariable("id") Integer id) {
        SuppliersRepo.deleteById(id);
    }
    @PutMapping("/suppliers/")
    private Suppliers updateSuppliers(@RequestBody Suppliers newSuppliers) {
        return SuppliersRepo.save(newSuppliers);
    }
}