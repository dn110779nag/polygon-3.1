package com.example.polygon31.repositories;

import com.example.polygon31.repositories.domains.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
