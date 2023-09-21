package com.example.polygon31.repositories.domains;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@lombok.Data
@lombok.Builder
@Table("authors")
public class Author {
    @Id
    private Long id;
    private String name;
}
