package com.ynov.SecurityPart2.services;

import com.ynov.SecurityPart2.models.Role;
import com.ynov.SecurityPart2.models.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUSerByPseudo(String pseudo);
    void addRoleToUser(User user, Role role);
    User createUser(User entity);
}
