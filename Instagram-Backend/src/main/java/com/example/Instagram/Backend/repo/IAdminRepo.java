package com.example.Instagram.Backend.repo;

import com.example.Instagram.Backend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
