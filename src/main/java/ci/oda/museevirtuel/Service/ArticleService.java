package ci.oda.museevirtuel.Service;

import ci.oda.museevirtuel.Model.Article;
import ci.oda.museevirtuel.Repositories.ArticleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository repoa;

    public List<Article> listAll(){
        return repoa.findAll();
    }

    public void save(Article article){
        repoa.save(article);
    }

    public Article get(Integer id_article){
        return repoa.findById(id_article).get();
    }

    public void delete(Integer id_article){

        repoa.deleteById(id_article);
    };
}

