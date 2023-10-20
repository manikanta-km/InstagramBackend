package com.example.Instagram.Backend.repo;

import com.example.Instagram.Backend.model.Comment;
import com.example.Instagram.Backend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICommentRepo extends JpaRepository<Comment,Integer> {
    List<Comment> findByInstaPost(Post myPost);

}
