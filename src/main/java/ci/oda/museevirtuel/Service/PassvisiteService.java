package ci.oda.museevirtuel.Service;

import ci.oda.museevirtuel.Model.Passvisite;
import ci.oda.museevirtuel.Repositories.PassvisiteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassvisiteService {
    @Autowired
    private PassvisiteRepository repopv;

    public List<Passvisite> listAll(){
        return repopv.findAll();
    }

    public void save(Passvisite passvisite){
        repopv.save(passvisite);
    }

    public Passvisite get(Integer id_pass){
        return repopv.findById(id_pass).get();
    }

    public void delete(Integer id_pass){

        repopv.deleteById(id_pass);
    };
}