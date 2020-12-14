package ci.oda.museevirtuel.Repositories;

import ci.oda.museevirtuel.Model.Users;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserDao extends CrudRepository<Users, Long> {
    
}