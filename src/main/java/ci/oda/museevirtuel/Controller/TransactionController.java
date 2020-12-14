package ci.oda.museevirtuel.Controller;
import ci.oda.museevirtuel.Model.Transaction;
import ci.oda.museevirtuel.Service.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService service ;

    @GetMapping("/transactions")
    public List<Transaction> list(){
        return service.listAll();
    }

    @GetMapping("/transactions/{id}")
    public Transaction get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/transactions")
    public void add(@RequestBody Transaction transaction){
        service.save(transaction);
    }

    @PutMapping("/transactions/{id}")
    public ResponseEntity<?> update(@RequestBody Transaction transaction,@PathVariable Integer id) {
        try {
            Transaction existTransaction = service.get(id);
            service.save(transaction);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/transactions/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }







}
