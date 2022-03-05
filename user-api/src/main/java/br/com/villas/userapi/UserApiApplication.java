package br.com.villas.userapi;

import br.com.villas.userapi.domain.User;
import br.com.villas.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.saveAll(List.of(new User(null, "João Vitor", "Villas@gmail.com", "123", 30.0),
                                   new User(null, "João Vitor", "Villas@gmail.com", "123", 20.0)));
    }
}
