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
public class Order_details_statusController {
    @Autowired
    private Order_details_statusRepository Order_details_statusRepo;
    @GetMapping("/order_details_status/")
    private Iterable<Order_details_status> getOrder_details_status() {
        return Order_details_statusRepo.findAll();
    }
    @GetMapping("/order_details_status/{id}/")
    private Order_details_status getOrder_details_statusById(@PathVariable("id") Integer id) {
        return Order_details_statusRepo.findById(id).get();
    }
    @PostMapping("/order_details_status/")
    private Order_details_status addOrder_details_status(@RequestBody Order_details_status newOrder_details_status) {
        return Order_details_statusRepo.save(newOrder_details_status);
    }
    @DeleteMapping("/order_details_status/{id}/")
    private void deleteOrder_details_status(@PathVariable("id") Integer id) {
        Order_details_statusRepo.deleteById(id);
    }
    @PutMapping("/order_details_status/")
    private Order_details_status updateOrder_details_status(@RequestBody Order_details_status newOrder_details_status) {
        return Order_details_statusRepo.save(newOrder_details_status);
    }
}