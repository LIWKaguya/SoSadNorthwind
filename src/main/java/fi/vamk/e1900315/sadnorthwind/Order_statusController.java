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
public class Order_statusController {
    @Autowired
    private Order_statusRepository Order_statusRepo;
    @GetMapping("/order_status/")
    private Iterable<Order_status> getOrder_status() {
        return Order_statusRepo.findAll();
    }
    @GetMapping("/order_status/{id}/")
    private Order_status getOrder_statusById(@PathVariable("id") Integer id) {
        return Order_statusRepo.findById(id).get();
    }
    @PostMapping("/order_status/")
    private Order_status addOrder_status(@RequestBody Order_status newOrder_status) {
        return Order_statusRepo.save(newOrder_status);
    }
    @DeleteMapping("/order_status/{id}/")
    private void deleteOrder_status(@PathVariable("id") Integer id) {
        Order_statusRepo.deleteById(id);
    }
    @PutMapping("/order_status/")
    private Order_status updateOrder_status(@RequestBody Order_status newOrder_status) {
        return Order_statusRepo.save(newOrder_status);
    }
}