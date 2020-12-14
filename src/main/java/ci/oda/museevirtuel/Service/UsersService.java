package ci.oda.museevirtuel.Service;

import ci.oda.museevirtuel.Model.Users;
import ci.oda.museevirtuel.Repositories.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepository repous;

    public List<Users> listAll(){
        return repous.findAll();
    }

    public void save(Users users){
        repous.save(users);
    }

    public Users get(Integer id){
        return repous.findById(id).get();
    }

    public void delete(Integer id_user){

        repous.deleteById(id_user);
    };
}
