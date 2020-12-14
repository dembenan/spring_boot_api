package ci.oda.museevirtuel.Controller;
import ci.oda.museevirtuel.Model.Categorie_article;
import ci.oda.museevirtuel.Service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class Categorie_articleController {

    @Autowired
    private Categorie_articleService service ;

    @GetMapping("/categories")
    public List<Categorie_article> list(){
        return service.listAll();
    }

    @GetMapping("/categories/{id}")
    public Categorie_article get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/categories")
    public void add(@RequestBody Categorie_article categorie_article){
        service.save(categorie_article);
    }
    @PutMapping("/categories/{id}")
    public ResponseEntity<?> update(@RequestBody Categorie_article categorie_article, @PathVariable Integer id) {
        try {
            Categorie_article existCategoriearticle = service.get(id);
            service.save(categorie_article);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/categories/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }







}

