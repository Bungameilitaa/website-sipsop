package comp.finalproject.user.repository;


import comp.finalproject.user.entity.RadioTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RadioTransactionRepository extends JpaRepository<RadioTransaction,Long> {

    List<RadioTransaction> findAll();

    RadioTransaction findById(long id);
}
