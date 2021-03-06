package org.GMaster.server.security.repository;

import org.GMaster.server.security.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findOneByUsername(String username);
}
