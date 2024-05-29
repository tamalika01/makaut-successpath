package com.mcet.makautsuccesspath.user;

import com.mcet.makautsuccesspath.ui.dto.RegisterRequestDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsManager {

    @Autowired
    private UserRepository repository;


    @Override
    public User loadUserByUsername(String email) throws UsernameNotFoundException {
        return repository.findByEmail(email).orElseThrow(
                () -> new UsernameNotFoundException("No user found with email = " + email));
    }

    @Override
    public void createUser(UserDetails user) {
        repository.save((User) user);
    }

    @Override
    public void updateUser(UserDetails user) {
        repository.save((User) user);
    }

    @Override
    public void deleteUser(String email) {
        User user = repository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("No User found for email -> " + email));
        repository.delete(user);
    }

    /**
     * This method assumes that both oldPassword and the newPassword params
     * are encoded with configured passwordEncoder
     *
     * @param oldPassword the old password of the user
     * @param newPassword the new password of the user
     */
    @Override
    @Transactional
    public void changePassword(String oldPassword, String newPassword) {
        User user = repository.findByPassword(oldPassword)
                .orElseThrow(() -> new UsernameNotFoundException("Invalid password "));
        user.setPassword(newPassword);
        repository.save(user);
    }

    @Override
    public boolean userExists(String email) {
        return repository.findByEmail(email).isPresent();
    }
}
