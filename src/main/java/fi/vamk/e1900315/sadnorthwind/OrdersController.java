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
public class OrdersController {
    @Autowired
    private OrdersRepository OrdersRepo;
    @GetMapping("/orders/")
    private Iterable<Orders> getOrders() {
        return OrdersRepo.findAll();
    }
    @GetMapping("/orders/{id}/")
    private Orders getOrdersById(@PathVariable("id") Integer id) {
        return OrdersRepo.findById(id).get();
    }
    @PostMapping("/orders/")
    private Orders addOrders(@RequestBody Orders newOrders) {
        return OrdersRepo.save(newOrders);
    }
    @DeleteMapping("/orders/{id}/")
    private void deleteOrders(@PathVariable("id") Integer id) {
        OrdersRepo.deleteById(id);
    }
    @PutMapping("/orders/")
    private Orders updateOrders(@RequestBody Orders newOrders) {
        return OrdersRepo.save(newOrders);
    }
}