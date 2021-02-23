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
public class ShippersController {
    @Autowired
    private ShippersRepository ShippersRepo;
    @GetMapping("/shippers/")
    private Iterable<Shippers> getShippers() {
        return ShippersRepo.findAll();
    }
    @GetMapping("/shippers/{id}/")
    private Shippers getShippersById(@PathVariable("id") Integer id) {
        return ShippersRepo.findById(id).get();
    }
    @PostMapping("/shippers/")
    private Shippers addShippers(@RequestBody Shippers newShippers) {
        return ShippersRepo.save(newShippers);
    }
    @DeleteMapping("/Shippers/{id}/")
    private void deleteShippers(@PathVariable("id") Integer id) {
        ShippersRepo.deleteById(id);
    }
    @PutMapping("/shippers/")
    private Shippers updateShippers(@RequestBody Shippers newShippers) {
        return ShippersRepo.save(newShippers);
    }
}