package com.example.polygon31.repositories;

import com.example.polygon31.TestContainerConfiguration;
import com.example.polygon31.repositories.domains.Author;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(TestContainerConfiguration.class)
class AuthorRepositoryTest {
    @Autowired
    private AuthorRepository instance;

    @BeforeEach
    @AfterEach
    void clear() {
        instance.deleteAll();
    }

    @Test
    void test() {
        Author testAuthor = instance.save(Author.builder()
                .name("test author")
                .build());

        Optional<Author> result = instance.findById(testAuthor.getId());

        assertThat(result).isPresent()
                .map(Author::getName)
                .get()
                .isEqualTo("test author");
    }
}