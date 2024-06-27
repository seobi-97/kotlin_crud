package com.example.kotlin_crud.controller

import com.example.kotlin_crud.entity.Users
import com.example.kotlin_crud.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {
    @GetMapping
    fun getAllUsers(): List<Users> = userService.findAll()

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long):ResponseEntity<Users>{
        val user = userService.findById(id)?:return ResponseEntity(HttpStatus.NOT_FOUND)
        return ResponseEntity(user, HttpStatus.OK)
    }

    @PostMapping
    fun createUser(@RequestBody user: Users): Users = userService.save(user)

    @DeleteMapping("/{id}")
    fun deleteUserById(@PathVariable id: Long):ResponseEntity<Unit>{
        userService.deleteById(id)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}