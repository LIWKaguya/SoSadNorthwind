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
public class ProductsController {
    @Autowired
    private ProductsRepository ProductsRepo;
    @GetMapping("/products/")
    private Iterable<Products> getProducts() {
        return ProductsRepo.findAll();
    }
    @GetMapping("/products/{id}/")
    private Products getProductsById(@PathVariable("id") Integer id) {
        return ProductsRepo.findById(id).get();
    }
    @PostMapping("/products/")
    private Products addProducts(@RequestBody Products newProducts) {
        return ProductsRepo.save(newProducts);
    }
    @DeleteMapping("/products/{id}/")
    private void deleteProducts(@PathVariable("id") Integer id) {
        ProductsRepo.deleteById(id);
    }
    @PutMapping("/products/")
    private Products updateProducts(@RequestBody Products newProducts) {
        return ProductsRepo.save(newProducts);
    }
}