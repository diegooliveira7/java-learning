package com.test.test_spring_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;
    private String email;

    public String getName() {
        return name;
    }
}
