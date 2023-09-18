package com.example.polygon31.repositories.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("users")
@lombok.Data
public class User {

    @Id
    private Long id;
    private String name;
    private LocalDateTime created;
}
