package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.repositories.RoleRepository;
import com.devsuperior.dslearnbds.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    private static Logger logger = LoggerFactory.getLogger(UserService.class);


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByEmail(username);
        if(user == null){
            logger.error("User NotFound: " + username);
            throw new UsernameNotFoundException("Email não existe");
        }
        logger.info("User Found: " + username);
        return user;
    }
}
