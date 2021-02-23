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
public class CustomersController {
    @Autowired
    private CustomersRepository CustomersRepo;
    @GetMapping("/customers/")
    private Iterable<Customers> getCustomers() {
        return CustomersRepo.findAll();
    }
    @GetMapping("/customers/{id}/")
    private Customers getCustomersById(@PathVariable("id") Integer id) {
        return CustomersRepo.findById(id).get();
    }
    @PostMapping("/customers/")
    private Customers addCustomers(@RequestBody Customers newCustomers) {
        return CustomersRepo.save(newCustomers);
    }
    @DeleteMapping("/customers/{id}/")
    private void deleteCustomers(@PathVariable("id") Integer id) {
        CustomersRepo.deleteById(id);
    }
    @PutMapping("/customers/")
    private Customers updateCustomers(@RequestBody Customers newCustomers) {
        return CustomersRepo.save(newCustomers);
    }
}