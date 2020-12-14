package ci.oda.museevirtuel.Service;

import ci.oda.museevirtuel.Model.Achat;
import ci.oda.museevirtuel.Repositories.AchatRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchatService {
    @Autowired
    private AchatRepository repoac;

    public List<Achat> listAll(){
        return repoac.findAll();
    }

    public void save(Achat achat){
        repoac.save(achat);
    }

    public Achat get(Integer id){
        return repoac.findById(id).get();
    }

    public void delete(Integer id_commande){

        repoac.deleteById(id_commande);
    };
}