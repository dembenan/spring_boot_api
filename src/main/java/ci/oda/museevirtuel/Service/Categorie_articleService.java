package ci.oda.museevirtuel.Service;

import ci.oda.museevirtuel.Model.Categorie_article;
import ci.oda.museevirtuel.Repositories.Categorie_articleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Categorie_articleService {
    @Autowired
    private Categorie_articleRepository repoc;

    public List<Categorie_article> listAll(){
        return repoc.findAll();
    }

    public void save(Categorie_article categorie_article){
        repoc.save(categorie_article);
    }

    public Categorie_article get(Integer id_categorie){
        return repoc.findById(id_categorie).get();
    }

    public void delete(Integer id_categorie){

        repoc.deleteById(id_categorie);
    };
}

