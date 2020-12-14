package ci.oda.museevirtuel.Controller;

import ci.oda.museevirtuel.Model.Achat;
import ci.oda.museevirtuel.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class AchatController {
    @Autowired
    private AchatService service ;

    @GetMapping("/achat")
    public List<Achat> list(){ 
        return service.listAll();
    }

    @GetMapping("/achat/{id}")
    public Achat get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/achat")
    public String add(@RequestBody Achat achat) {
        service.save(achat);
        return "L'ajout a été effectué avec succès";
    }

    @PutMapping("/achat/{id}")
    public ResponseEntity<?> update(@RequestBody Achat achat,@PathVariable Integer id) {
        try {
            service.save(achat);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/achat/{id}")
    public String delete(@PathVariable Integer id) {
        service.delete(id);
        return "La suppression a été effectué avec succès";
    }






}