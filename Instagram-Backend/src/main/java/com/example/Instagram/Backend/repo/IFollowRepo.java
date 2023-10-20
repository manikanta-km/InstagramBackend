package com.example.Instagram.Backend.repo;

import com.example.Instagram.Backend.model.Follow;
import com.example.Instagram.Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFollowRepo extends JpaRepository<Follow,Integer> {
    List<Follow> findByCurrentUserAndCurrentUserFollower(User target, User follower);

}
