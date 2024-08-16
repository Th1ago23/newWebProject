package com.javalearning.newwebproject.models;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="tasks")
@Table(name="tasks")
@Getter @Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Task{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Enumerated(EnumType.STRING)
    private TaskPriority priority;

    @ManyToOne
    private User user;

}
