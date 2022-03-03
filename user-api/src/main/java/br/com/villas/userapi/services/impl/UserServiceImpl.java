package br.com.villas.userapi.services.impl;

import br.com.villas.userapi.domain.User;
import br.com.villas.userapi.repositories.UserRepository;
import br.com.villas.userapi.services.UserService;
import br.com.villas.userapi.services.exceptions.ObjectNotFounException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFounException("Object Not Found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
