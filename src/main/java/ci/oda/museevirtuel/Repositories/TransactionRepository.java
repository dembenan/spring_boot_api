package ci.oda.museevirtuel.Repositories;
import ci.oda.museevirtuel.Model.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}

