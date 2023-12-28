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

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private int grade;

    @Column(nullable = false)
    private int classNo;

    @Column(nullable = false)
    private int studentNo;

    @Builder
    public Member(String userName, String password, String nickname, int grade, int classNo, int studentNo) {
        this.userName = userName;
        this.password = password;
        this.nickname = nickname;
        this.grade = grade;
        this.classNo = classNo;
        this.studentNo = studentNo;
    }

    public Long getId() {
        return id;
    }
}
