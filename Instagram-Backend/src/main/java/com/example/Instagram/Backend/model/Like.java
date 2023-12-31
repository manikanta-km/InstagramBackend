package com.example.Instagram.Backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "InstagramLike")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer likeId;

    @ManyToOne
    @JoinColumn(name = "fk_post_id")
    private Post instaPost;

    @ManyToOne
    @JoinColumn(name = "fk_liker_id")
    private User liker;
}
