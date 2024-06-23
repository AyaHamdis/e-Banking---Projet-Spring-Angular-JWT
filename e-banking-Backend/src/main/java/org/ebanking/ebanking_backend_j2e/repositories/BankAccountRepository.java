package org.ebanking.ebanking_backend_j2e.repositories;

import org.ebanking.ebanking_backend_j2e.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
