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
public class Sales_reportsController {
    @Autowired
    private Sales_reportsRepository Sales_reportsRepo;
    @GetMapping("/sales_reports/")
    private Iterable<Sales_reports> getSales_reports() {
        return Sales_reportsRepo.findAll();
    }
    @GetMapping("/sales_reports/{id}/")
    private Sales_reports getSales_reportsById(@PathVariable("id") Integer id) {
        return Sales_reportsRepo.findById(id).get();
    }
    @PostMapping("/sales_reports/")
    private Sales_reports addSales_reports(@RequestBody Sales_reports newSales_reports) {
        return Sales_reportsRepo.save(newSales_reports);
    }
    @DeleteMapping("/sales_reports/{id}/")
    private void deleteSales_reports(@PathVariable("id") Integer id) {
        Sales_reportsRepo.deleteById(id);
    }
    @PutMapping("/sales_reports/")
    private Sales_reports updateSales_reports(@RequestBody Sales_reports newSales_reports) {
        return Sales_reportsRepo.save(newSales_reports);
    }
}