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
public class Employee_privilegesController {
    @Autowired
    private Employee_privilegesRepository Employee_privilegesRepo;
    @GetMapping("/employee_privileges/")
    private Iterable<Employee_privileges> getEmployee_privileges() {
        return Employee_privilegesRepo.findAll();
    }
    @GetMapping("/employee_privileges/{id}/")
    private Employee_privileges getEmployee_privilegesById(@PathVariable("id") Integer id) {
        return Employee_privilegesRepo.findById(id).get();
    }
    @PostMapping("/employee_privileges/")
    private Employee_privileges addEmployee_privileges(@RequestBody Employee_privileges newEmployee_privileges) {
        return Employee_privilegesRepo.save(newEmployee_privileges);
    }
    @DeleteMapping("/employee_privileges/{id}/")
    private void deleteEmployee_privileges(@PathVariable("id") Integer id) {
        Employee_privilegesRepo.deleteById(id);
    }
    @PutMapping("/employee_privileges/")
    private Employee_privileges updateEmployee_privileges(@RequestBody Employee_privileges newEmployee_privileges) {
        return Employee_privilegesRepo.save(newEmployee_privileges);
    }
}