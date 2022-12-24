package com.example.authservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author NhatPA
 * @since 23/12/2022 - 16:32
 */
@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;
}
