package com.educandoweb.course.config;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner { // Essa implementação serve para toda vez que rodarmos o projeto, ele rodar essas configurações

    private UserRepository userRepository;

    public TestConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Rafael Mainieri", "rafael@gmail.com", "987654321", "senha123");
        User u2 = new User(null, "Rodrigo Weber", "rodrigo@gmail.com", "912345678", "senha456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
