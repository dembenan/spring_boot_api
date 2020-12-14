package ci.oda.museevirtuel.Controller;
import ci.oda.museevirtuel.Model.Article;
import ci.oda.museevirtuel.Service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService service ;

    @GetMapping("/articles")
    public List<Article> list(){
        return service.listAll();
    }

    @GetMapping("/articles/{id}")
    public Article get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/articles")
    public void add(@RequestBody Article article){
        service.save(article);
    }
    @PutMapping("/articles/{id}")
    public ResponseEntity<?> update(@RequestBody Article article, @PathVariable Integer id) {
        try {
            service.save(article);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/articles/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }







}

