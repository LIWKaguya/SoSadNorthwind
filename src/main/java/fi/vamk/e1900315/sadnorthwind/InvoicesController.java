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
public class InvoicesController {
    @Autowired
    private InvoicesRepository InvoicesRepo;
    @GetMapping("/invoices/")
    private Iterable<Invoices> getInvoices() {
        return InvoicesRepo.findAll();
    }
    @GetMapping("/invoices/{id}/")
    private Invoices getInvoicesById(@PathVariable("id") Integer id) {
        return InvoicesRepo.findById(id).get();
    }
    @PostMapping("/invoices/")
    private Invoices addInvoices(@RequestBody Invoices newInvoices) {
        return InvoicesRepo.save(newInvoices);
    }
    @DeleteMapping("/invoices/{id}/")
    private void deleteInvoices(@PathVariable("id") Integer id) {
        InvoicesRepo.deleteById(id);
    }
    @PutMapping("/invoices/")
    private Invoices updateInvoices(@RequestBody Invoices newInvoices) {
        return InvoicesRepo.save(newInvoices);
    }
}