package org.GMaster.server.security.auth;

import org.GMaster.server.security.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface TokenHandler {
    Optional<UserDetails> parseUserFromToken(String token);
    String createTokenForUser(User user);
}
