package com.saerok.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Paper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
