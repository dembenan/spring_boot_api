package ci.oda.museevirtuel.Controller;
import ci.oda.museevirtuel.Service.*;
import ci.oda.museevirtuel.Model.Visite;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class VisiteController {
    @Autowired
    private VisiteService service ;

    @GetMapping("/visite")
    public List<Visite> list(){
        return service.listAll();
    }

    @GetMapping("/visite/{id}")
    public Visite get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/visite")
    public String add(@RequestBody Visite visite) {
        service.save(visite);
        return "L'ajout a été effectué avec succès";
    }

    @PutMapping("/visite/{id}")
    public ResponseEntity<?> update(@RequestBody Visite visite,@PathVariable Integer id) {
        try {
            service.save(visite);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/visite/{id}")
    public String delete(@PathVariable Integer id) {
        service.delete(id);
        return "La suppression a été effectué avec succès";
    }

}