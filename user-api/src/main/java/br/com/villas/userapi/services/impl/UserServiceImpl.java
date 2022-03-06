package br.com.villas.userapi.services.impl;

import br.com.villas.userapi.domain.User;
import br.com.villas.userapi.repositories.UserRepository;
import br.com.villas.userapi.services.UserService;
import br.com.villas.userapi.services.exceptions.ObjectNotFounException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final Environment env;
    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        log.info("USER SERVICE ::: GET REQUEST ON " + env.getProperty("local.server.port") + " port");
        return repository.findById(id).orElseThrow(() -> new ObjectNotFounException("Object Not Found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
