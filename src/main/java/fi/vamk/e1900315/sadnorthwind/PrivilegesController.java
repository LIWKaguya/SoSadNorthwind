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
public class PrivilegesController {
    @Autowired
    private PrivilegesRepository PrivilegesRepo;
    @GetMapping("/privileges/")
    private Iterable<Privileges> getPrivileges() {
        return PrivilegesRepo.findAll();
    }
    @GetMapping("/privileges/{id}/")
    private Privileges getPrivilegesById(@PathVariable("id") Integer id) {
        return PrivilegesRepo.findById(id).get();
    }
    @PostMapping("/privileges/")
    private Privileges addPrivileges(@RequestBody Privileges newPrivileges) {
        return PrivilegesRepo.save(newPrivileges);
    }
    @DeleteMapping("/privileges/{id}/")
    private void deletePrivileges(@PathVariable("id") Integer id) {
        PrivilegesRepo.deleteById(id);
    }
    @PutMapping("/privileges/")
    private Privileges updatePrivileges(@RequestBody Privileges newPrivileges) {
        return PrivilegesRepo.save(newPrivileges);
    }
}