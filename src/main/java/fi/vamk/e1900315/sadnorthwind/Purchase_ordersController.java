package fi.vamk.e1900315.sadnorthwind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@RestController
public class Purchase_ordersController {
    @Autowired
    private Purchase_ordersRepository Purchase_ordersRepo;
    @GetMapping("/purchase_orders/")
    private Iterable<Purchase_orders> getPurchase_orders() {
        return Purchase_ordersRepo.findAll();
    }
    @GetMapping("/purchase_orders/{id}/")
    private Purchase_orders getPurchase_ordersById(@PathVariable("id") Integer id) {
        return Purchase_ordersRepo.findById(id).get();
    }
    @PostMapping("/purchase_orders/")
    private Purchase_orders addPurchase_orders(@RequestBody Purchase_orders newPurchase_orders) {
        return Purchase_ordersRepo.save(newPurchase_orders);
    }
    @DeleteMapping("/purchase_orders/{id}/")
    private void deletePurchase_orders(@PathVariable("id") Integer id) {
        Purchase_ordersRepo.deleteById(id);
    }
    @PutMapping("/purchase_orders/")
    private Purchase_orders updatePurchase_orders(@RequestBody Purchase_orders newPurchase_orders) {
        return Purchase_ordersRepo.save(newPurchase_orders);
    }
}