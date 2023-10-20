package com.example.Instagram.Backend.repo;

import com.example.Instagram.Backend.model.Like;
import com.example.Instagram.Backend.model.Post;
import com.example.Instagram.Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILikeRepo extends JpaRepository<Like,Integer> {
    List<Like> findByInstaPost(Post myPost);

    List<Like> findByInstaPostAndLiker(Post instaPostToBeLiked, User liker);
}
