package ci.oda.museevirtuel.Service;

import ci.oda.museevirtuel.Model.Favoris;
import ci.oda.museevirtuel.Repositories.FavorisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavorisService {
    @Autowired
    private FavorisRepository repof;

    public List<Favoris> listAll(){
        return repof.findAll();
    }

    public void save(Favoris favoris){
        repof.save(favoris);
    }

    public Favoris get(Integer id_fav){
        return repof.findById(id_fav).get();
    }

    public void delete(Integer id_fav){

        repof.deleteById(id_fav);
    };
}
