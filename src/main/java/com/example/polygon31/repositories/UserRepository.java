package com.example.polygon31.repositories;

import com.example.polygon31.repositories.domains.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
