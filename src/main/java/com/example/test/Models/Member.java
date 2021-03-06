package com.example.test.Models;

import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mbrNo;
    private String id;
    private String name;

    @Builder
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
