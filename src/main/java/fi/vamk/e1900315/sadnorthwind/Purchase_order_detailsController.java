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
public class Purchase_order_detailsController {
    @Autowired
    private Purchase_order_detailsRepository Purchase_order_detailsRepo;
    @GetMapping("/purchase_order_details/")
    private Iterable<Purchase_order_details> getPurchase_order_details() {
        return Purchase_order_detailsRepo.findAll();
    }
    @GetMapping("/purchase_order_details/{id}/")
    private Purchase_order_details getPurchase_order_detailsById(@PathVariable("id") Integer id) {
        return Purchase_order_detailsRepo.findById(id).get();
    }
    @PostMapping("/purchase_order_details/")
    private Purchase_order_details addPurchase_order_details(@RequestBody Purchase_order_details newPurchase_order_details) {
        return Purchase_order_detailsRepo.save(newPurchase_order_details);
    }
    @DeleteMapping("/purchase_order_details/{id}/")
    private void deletePurchase_order_details(@PathVariable("id") Integer id) {
        Purchase_order_detailsRepo.deleteById(id);
    }
    @PutMapping("/purchase_order_details/")
    private Purchase_order_details updatePurchase_order_details(@RequestBody Purchase_order_details newPurchase_order_details) {
        return Purchase_order_detailsRepo.save(newPurchase_order_details);
    }
}