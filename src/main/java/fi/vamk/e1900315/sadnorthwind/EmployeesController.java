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
public class EmployeesController {
    @Autowired
    private EmployeesRepository EmployeesRepo;
    @GetMapping("/employees/")
    private Iterable<Employees> getEmployees() {
        return EmployeesRepo.findAll();
    }
    @GetMapping("/employees/{id}/")
    private Employees getEmployeesById(@PathVariable("id") Integer id) {
        return EmployeesRepo.findById(id).get();
    }
    @PostMapping("/employees/")
    private Employees addEmployees(@RequestBody Employees newEmployees) {
        return EmployeesRepo.save(newEmployees);
    }
    @DeleteMapping("/employees/{id}/")
    private void deleteEmployees(@PathVariable("id") Integer id) {
        EmployeesRepo.deleteById(id);
    }
    @PutMapping("/employees/")
    private Employees updateEmployees(@RequestBody Employees newEmployees) {
        return EmployeesRepo.save(newEmployees);
    }
}