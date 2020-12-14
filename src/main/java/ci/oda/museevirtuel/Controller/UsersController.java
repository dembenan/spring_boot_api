package ci.oda.museevirtuel.Controller;
import ci.oda.museevirtuel.Service.*;
import ci.oda.museevirtuel.Model.Users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class UsersController {

    @Autowired
    private UsersService service ;

    @GetMapping("/users")
    public List<Users> list(){
        return service.listAll();
    }

    @GetMapping("/users/{id}")
    public Users get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/users")
    public String add(@RequestBody Users users) {
        service.save(users);
        return "L'ajout a été effectué avec succès";
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<?> update(@RequestBody Users users,@PathVariable Integer id) {
        try {
            service.save(users);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable Integer id) {
        service.delete(id);
        return "La suppression a été effectué avec succès";
    }







}
