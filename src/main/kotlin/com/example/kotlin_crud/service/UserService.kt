package com.example.kotlin_crud.service

import com.example.kotlin_crud.entity.Users
import com.example.kotlin_crud.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun findAll(): List<Users> = userRepository.findAll()
    fun findById(id:Long): Users? = userRepository.findById(id).orElse(null)
    fun save(user: Users): Users = userRepository.save(user)
    fun deleteById(id: Long) = userRepository.deleteById(id)
}