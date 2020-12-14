package ci.oda.museevirtuel.Repositories;
import ci.oda.museevirtuel.Model.Achat;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AchatRepository extends JpaRepository<Achat,Integer> {
    
}