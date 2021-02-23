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
public class Inventory_transaction_typesController {
    @Autowired
    private Inventory_transaction_typesRepository Inventory_transaction_typesRepo;
    @GetMapping("/inventory_transaction_types/")
    private Iterable<Inventory_transaction_types> getInventory_transaction_types() {
        return Inventory_transaction_typesRepo.findAll();
    }
    @GetMapping("/inventory_transaction_types/{id}/")
    private Inventory_transaction_types getInventory_transaction_typesById(@PathVariable("id") Integer id) {
        return Inventory_transaction_typesRepo.findById(id).get();
    }
    @PostMapping("/inventory_transaction_types/")
    private Inventory_transaction_types addInventory_transaction_types(@RequestBody Inventory_transaction_types newInventory_transaction_types) {
        return Inventory_transaction_typesRepo.save(newInventory_transaction_types);
    }
    @DeleteMapping("/inventory_transaction_types/{id}/")
    private void deleteInventory_transaction_types(@PathVariable("id") Integer id) {
        Inventory_transaction_typesRepo.deleteById(id);
    }
    @PutMapping("/inventory_transaction_types/")
    private Inventory_transaction_types updateInventory_transaction_types(@RequestBody Inventory_transaction_types newInventory_transaction_types) {
        return Inventory_transaction_typesRepo.save(newInventory_transaction_types);
    }
}