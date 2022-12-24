package com.example.authservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author NhatPA
 * @since 23/12/2022 - 16:34
 */
@Entity
@Table(name = "order")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, optional = false)
    @JoinColumn(name = "user_id")
    private User user;
}
