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
public class Purchase_order_statusController {
    @Autowired
    private Purchase_order_statusRepository Purchase_order_statusRepo;
    @GetMapping("/purchase_order_status/")
    private Iterable<Purchase_order_status> getPurchase_order_status() {
        return Purchase_order_statusRepo.findAll();
    }
    @GetMapping("/purchase_order_status/{id}/")
    private Purchase_order_status getPurchase_order_statusById(@PathVariable("id") Integer id) {
        return Purchase_order_statusRepo.findById(id).get();
    }
    @PostMapping("/purchase_order_status/")
    private Purchase_order_status addPurchase_order_status(@RequestBody Purchase_order_status newPurchase_order_status) {
        return Purchase_order_statusRepo.save(newPurchase_order_status);
    }
    @DeleteMapping("/purchase_order_status/{id}/")
    private void deletePurchase_order_status(@PathVariable("id") Integer id) {
        Purchase_order_statusRepo.deleteById(id);
    }
    @PutMapping("/purchase_order_status/")
    private Purchase_order_status updatePurchase_order_status(@RequestBody Purchase_order_status newPurchase_order_status) {
        return Purchase_order_statusRepo.save(newPurchase_order_status);
    }
}