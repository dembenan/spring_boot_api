package ci.oda.museevirtuel.Repositories;
import ci.oda.museevirtuel.Model.Visite;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VisiteRepository extends JpaRepository<Visite,Integer> {
    
}