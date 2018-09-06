package org.GMaster.server.security.repository;

import org.GMaster.server.security.model.Authority;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority,Long> {
}
