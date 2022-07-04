package com.ssws.entities;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class User implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
