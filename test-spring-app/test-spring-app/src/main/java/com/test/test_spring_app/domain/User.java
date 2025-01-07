package com.test.test_spring_app.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@Entity(name = "users")
@EqualsAndHashCode(of = "id")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String email;

    public String getName() {
        return name;
    }
}
