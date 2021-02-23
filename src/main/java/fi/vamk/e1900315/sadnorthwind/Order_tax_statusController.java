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
public class Order_tax_statusController {
    @Autowired
    private Order_tax_statusRepository Order_tax_statusRepo;
    @GetMapping("/order_tax_status/")
    private Iterable<Order_tax_status> getOrder_tax_status() {
        return Order_tax_statusRepo.findAll();
    }
    @GetMapping("/order_tax_status/{id}/")
    private Order_tax_status getOrder_tax_statusById(@PathVariable("id") Integer id) {
        return Order_tax_statusRepo.findById(id).get();
    }
    @PostMapping("/order_tax_status/")
    private Order_tax_status addOrder_tax_status(@RequestBody Order_tax_status newOrder_tax_status) {
        return Order_tax_statusRepo.save(newOrder_tax_status);
    }
    @DeleteMapping("/order_tax_status/{id}/")
    private void deleteOrder_tax_status(@PathVariable("id") Integer id) {
        Order_tax_statusRepo.deleteById(id);
    }
    @PutMapping("/order_tax_status/")
    private Order_tax_status updateOrder_tax_status(@RequestBody Order_tax_status newOrder_tax_status) {
        return Order_tax_statusRepo.save(newOrder_tax_status);
    }
}