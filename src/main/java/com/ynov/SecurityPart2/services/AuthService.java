package com.ynov.SecurityPart2.services;

import com.ynov.SecurityPart2.models.Role;
import com.ynov.SecurityPart2.models.User;

public interface AuthService {
    String login(User user, String password);
    User register(User entity, Role prof);

}
