package com.example.kotlin_crud.repository

import com.example.kotlin_crud.entity.Users
import org.springframework.data.jpa.repository.JpaRepository
interface UserRepository :JpaRepository<Users, Long>