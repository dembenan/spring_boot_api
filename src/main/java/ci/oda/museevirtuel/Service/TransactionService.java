package ci.oda.museevirtuel.Service;

import ci.oda.museevirtuel.Model.Transaction;
import ci.oda.museevirtuel.Repositories.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository repotr;

    public List<Transaction> listAll(){
        return repotr.findAll();
    }

    public void save(Transaction transaction){
        repotr.save(transaction);
    }

    public Transaction get(Integer id){
        return repotr.findById(id).get();
    }

    public void delete(Integer id_trans){

        repotr.deleteById(id_trans);
    };
}
