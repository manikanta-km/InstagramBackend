package com.example.Instagram.Backend.service;

import com.example.Instagram.Backend.model.Like;
import com.example.Instagram.Backend.model.Post;
import com.example.Instagram.Backend.model.User;
import com.example.Instagram.Backend.repo.ILikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {

    @Autowired
    ILikeRepo likeRepo;
    public void clearLikesByPost(Post myPost) {

        List<Like> likesOfPost = likeRepo.findByInstaPost(myPost);
        likeRepo.deleteAll(likesOfPost);
    }

    public boolean isAlreadyLiked(Post instaPostToBeLiked, User liker) {
        List<Like> likes =  likeRepo.findByInstaPostAndLiker(instaPostToBeLiked,liker);

        return (likes!=null && likes.size()!=0);
    }

    public void addLike(Like newLike) {
        likeRepo.save(newLike);
    }

    public String removeLikesByLikerAndPost(User potentialLiker, Post instaPostToBeUnLiked) {
        List<Like> likes =  likeRepo.findByInstaPostAndLiker(instaPostToBeUnLiked,potentialLiker);

        if(!likes.isEmpty())
        {
            likeRepo.deleteAll(likes);
            return "Un-liked";
        }
        {
            return "Note liked yet, cannot dislike!!";
        }
    }

    public String getLikesForPost(Post instaPost) {
        List<Like> likes  = likeRepo.findByInstaPost(instaPost);

        return String.valueOf(likes.size());
    }
}
