package com.example.polygon31.repositories;

import com.example.polygon31.TestContainerConfiguration;
import com.example.polygon31.repositories.domains.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


//@SpringBootTest
@DataJdbcTest
@AutoConfigureTestDatabase (replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(TestContainerConfiguration.class)
class UserRepositoryTest {

    @Autowired
    private UserRepository instance;

    @BeforeEach
    @AfterEach
    void clear() {
        instance.deleteAll();
    }

    @Test
    void test() {
        User testUser = instance.save(User.builder()
                .name("test user")
                .build());

        Optional<User> result = instance.findById(testUser.getId());

        assertThat(result).isPresent()
                .map(User::getName)
                .get()
                .isEqualTo("test user");
    }
}