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
public class Inventory_transactionsController {
    @Autowired
    private Inventory_transactionsRepository Inventory_transactionsRepo;
    @GetMapping("/inventory_transactions/")
    private Iterable<Inventory_transactions> getInventory_transactions() {
        return Inventory_transactionsRepo.findAll();
    }
    @GetMapping("/inventory_transactions/{id}/")
    private Inventory_transactions getInventory_transactionsById(@PathVariable("id") Integer id) {
        return Inventory_transactionsRepo.findById(id).get();
    }
    @PostMapping("/inventory_transactions/")
    private Inventory_transactions addInventory_transactions(@RequestBody Inventory_transactions newInventory_transactions) {
        return Inventory_transactionsRepo.save(newInventory_transactions);
    }
    @DeleteMapping("/inventory_transactions/{id}/")
    private void deleteInventory_transactions(@PathVariable("id") Integer id) {
        Inventory_transactionsRepo.deleteById(id);
    }
    @PutMapping("/inventory_transactions/")
    private Inventory_transactions updateInventory_transactions(@RequestBody Inventory_transactions newInventory_transactions) {
        return Inventory_transactionsRepo.save(newInventory_transactions);
    }
}