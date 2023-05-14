package com.aninfo.repository;

import java.util.List;
import java.util.Optional;

import com.aninfo.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    Optional<Transaction> findTransactionById(Long id);

    @Override
    List<Transaction> findAll();

}
