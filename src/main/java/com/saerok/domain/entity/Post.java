package com.saerok.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Post extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String hashtag;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_file_id")
    private AttachFile imageFile;

    @Builder
    public Post(String title, String hashtag, AttachFile imageFile) {
        this.title = title;
        this.hashtag = hashtag;
        this.imageFile = imageFile;
    }
}
