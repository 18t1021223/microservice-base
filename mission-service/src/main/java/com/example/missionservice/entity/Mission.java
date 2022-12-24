package com.example.missionservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author NhatPA
 * @since 23/12/2022 - 17:43
 */
@Table(name = "mission")
@Entity
@Getter
@Setter
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
