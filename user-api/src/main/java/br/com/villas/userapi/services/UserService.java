package br.com.villas.userapi.services;

import br.com.villas.userapi.domain.User;

import java.util.List;

public interface UserService {

   User findById(Long id);
    List<User> findAll();
}
