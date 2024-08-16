package com.javalearning.newwebproject.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name="users")
@Entity(name="users")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique=true)
    private String username;

    @Column(unique=true)
    private String password;
    private String firstName;
    private String lastName;

    @Column(unique=true)
    private String email;
    @Column(unique=true)
    private String phone;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Task> tasks;

}
