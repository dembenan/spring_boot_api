package ci.oda.museevirtuel.Controller;
import ci.oda.museevirtuel.Model.Detail_achat;
import ci.oda.museevirtuel.Service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class Detail_achatController {

    @Autowired
    private Detail_achatService service ;

    @GetMapping("/detailachat")
    public List<Detail_achat> list(){
        return service.listAll();
    }

    @GetMapping("/detailachat/{id}")
    public Detail_achat get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/detailachat")
    public void add(@RequestBody Detail_achat detail_achat){
        service.save(detail_achat);
    }
    @PutMapping("/detailachat/{id}")
    public ResponseEntity<?> update(@RequestBody Detail_achat detail_achat, @PathVariable Integer id) {
        try {
            Detail_achat existDetail_achat = service.get(id);
            service.save(detail_achat);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/detailachat/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }







}

