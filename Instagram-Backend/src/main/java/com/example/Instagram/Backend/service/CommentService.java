package com.example.Instagram.Backend.service;

import com.example.Instagram.Backend.model.Comment;
import com.example.Instagram.Backend.model.Post;
import com.example.Instagram.Backend.repo.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    ICommentRepo commentRepo;
    public void clearCommentsByPost(Post myPost) {
        List<Comment> commentsOfPost = commentRepo.findByInstaPost(myPost);
        commentRepo.deleteAll(commentsOfPost);
    }

    public void addComment(Comment newComment) {
        commentRepo.save(newComment);
    }

        public Comment findCommentById(Integer commentId) {
            return commentRepo.findById(commentId).orElseThrow();
        }

        public void removeCommentById(Integer commentId) {
            commentRepo.deleteById(commentId);
        }

}
