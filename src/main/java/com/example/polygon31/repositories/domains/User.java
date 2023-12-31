package com.example.polygon31.repositories.domains;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("users")
@lombok.Data
@Builder
public class User {

    @Id
    private Long id;
    private String name;
    @Builder.Default
    private LocalDateTime created = LocalDateTime.now();
}
