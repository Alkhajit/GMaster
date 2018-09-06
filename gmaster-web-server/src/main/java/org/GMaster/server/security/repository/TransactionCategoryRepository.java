package org.GMaster.server.security.repository;

import org.GMaster.server.security.model.TransactionCategory;
import org.springframework.data.repository.CrudRepository;

public interface TransactionCategoryRepository extends CrudRepository<TransactionCategory, Long> {
}
