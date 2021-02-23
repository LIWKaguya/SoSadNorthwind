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
public class StringsController {
    @Autowired
    private StringsRepository StringsRepo;
    @GetMapping("/strings/")
    private Iterable<Strings> getStrings() {
        return StringsRepo.findAll();
    }
    @GetMapping("/strings/{id}/")
    private Strings getStringsById(@PathVariable("id") Integer id) {
        return StringsRepo.findById(id).get();
    }
    @PostMapping("/strings/")
    private Strings addStrings(@RequestBody Strings newStrings) {
        return StringsRepo.save(newStrings);
    }
    @DeleteMapping("/strings/{id}/")
    private void deleteStrings(@PathVariable("id") Integer id) {
        StringsRepo.deleteById(id);
    }
    @PutMapping("/strings/")
    private Strings updateStrings(@RequestBody Strings newStrings) {
        return StringsRepo.save(newStrings);
    }
}