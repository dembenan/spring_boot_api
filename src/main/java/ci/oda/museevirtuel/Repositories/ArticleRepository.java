package ci.oda.museevirtuel.Repositories;
import ci.oda.museevirtuel.Model.Article;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Integer> {
}


