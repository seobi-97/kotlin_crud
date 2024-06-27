package com.example.kotlin_crud.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GenerationType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
data class Users (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = 0,
    val username: String,
    val role: String,
    val email: String,
    val password: String,
    val nickname: String,
    @Column(updatable = false)
    val created_at: LocalDateTime = LocalDateTime.now()
)