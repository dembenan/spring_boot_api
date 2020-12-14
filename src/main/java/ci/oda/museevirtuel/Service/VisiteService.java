package ci.oda.museevirtuel.Service;

import ci.oda.museevirtuel.Model.Visite;
import ci.oda.museevirtuel.Repositories.VisiteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisiteService {
    @Autowired
    private VisiteRepository repovisite;

    public List<Visite> listAll(){
        return repovisite.findAll();
    }

    public void save(Visite visite){
        repovisite.save(visite);
    }

    public Visite get(Integer id){
        return repovisite.findById(id).get();
    }

    public void delete(Integer id_visite){

        repovisite.deleteById(id_visite);
    };
}