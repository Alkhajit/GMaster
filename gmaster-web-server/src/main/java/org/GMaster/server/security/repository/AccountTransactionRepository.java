package org.GMaster.server.security.repository;

import org.GMaster.server.security.model.AccountTransaction;
import org.springframework.data.repository.CrudRepository;

public interface AccountTransactionRepository extends CrudRepository<AccountTransaction, Long> {
}
