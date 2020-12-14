package ci.oda.museevirtuel.Controller;
import ci.oda.museevirtuel.Model.Favoris;
import ci.oda.museevirtuel.Service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class FavorisController {

    @Autowired
    private FavorisService service ;

    @GetMapping("/favoris")
    public List<Favoris> list(){
        return service.listAll();
    }

    @GetMapping("/favoris/{id}")
    public Favoris get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/favoris")
    public void add(@RequestBody Favoris favoris){
        service.save(favoris);
    }
    @PutMapping("/favoris/{id}")
    public ResponseEntity<?> update(@RequestBody Favoris favoris,@PathVariable Integer id) {
        try {
            Favoris existFavoris = service.get(id);
            service.save(favoris);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/favoris/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }







}
