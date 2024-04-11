package com.ynov.SecurityPart2.servicesImplem;

import com.ynov.SecurityPart2.models.Role;
import com.ynov.SecurityPart2.models.User;
import com.ynov.SecurityPart2.repositories.UserRepo;
import com.ynov.SecurityPart2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserImplem implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public Optional<User> getUSerByPseudo(String pseudo) {
        return userRepo.findByPseudo(pseudo);
    }

    @Override
    public void addRoleToUser(User user, Role role){
        user.addRole(role);
        userRepo.save(user);
    }

    @Override
    public User createUser(User entity) {
        return userRepo.save(entity);
    }
}
