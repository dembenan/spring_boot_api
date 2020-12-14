package ci.oda.museevirtuel.Service;

import ci.oda.museevirtuel.Model.Detail_achat;
import ci.oda.museevirtuel.Repositories.Detail_achatRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Detail_achatService {
    @Autowired
    private Detail_achatRepository repoda;

    public List<Detail_achat> listAll(){
        return repoda.findAll();
    }

    public void save(Detail_achat detail_achat){
        repoda.save(detail_achat);
    }

    public Detail_achat get(Integer id_detail){
        return repoda.findById(id_detail).get();
    }

    public void delete(Integer id_detail){

        repoda.deleteById(id_detail);
    };
}
