package ci.oda.museevirtuel.Controller;
import ci.oda.museevirtuel.Model.Passvisite;
import ci.oda.museevirtuel.Service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class PassvisiteController {
    @Autowired
    private PassvisiteService service ;

    @GetMapping("/passvisite")
    public List<Passvisite> list(){
        return service.listAll();
    }

    @GetMapping("/passvisite/{id}")
    public Passvisite get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/passvisite")
    public String add(@RequestBody Passvisite passvisite) {
        service.save(passvisite);
        return "L'ajout a été effectué avec succès";
    }
    @PutMapping("/passvisite/{id}")
    public ResponseEntity<?> update(@RequestBody Passvisite passvisite,@PathVariable Integer id) {
        try {
            Passvisite existPassvisite = service.get(id);
            service.save(passvisite);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/passvisite/{id}")
    public String delete(@PathVariable Integer id) {
        service.delete(id);
        return "La suppression a été effectué avec succès";
    }
 
}