package com.tnh.jpaflywayexample.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
