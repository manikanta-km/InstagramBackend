package com.example.Instagram.Backend.repo;

import com.example.Instagram.Backend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}
