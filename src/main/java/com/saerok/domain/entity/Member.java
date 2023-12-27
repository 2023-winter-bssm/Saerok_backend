package com.saerok.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private int grade;

    @Column(nullable = false)
    private int classNo;

    @Column(nullable = false)
    private int studentNo;

    @Column(nullable = false)
    private String nickname;

    @Builder

    public Member(String userName, String password, int grade, int classNo, int studentNo, String nickname) {
        this.userName = userName;
        this.password = password;
        this.grade = grade;
        this.classNo = classNo;
        this.studentNo = studentNo;
        this.nickname = nickname;
    }
}
