package com.saerok.domain.entity;

import jakarta.persistence.*;

@Entity
public class AttachFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String url;


}
