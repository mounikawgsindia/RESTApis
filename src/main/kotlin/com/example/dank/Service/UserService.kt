package com.example.dank.Service

import com.example.dank.model.User
import com.example.dank.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUserById(id: String): User? = userRepository.findById(id).orElse(null)

    fun createUser(user: User): User = userRepository.save(user)

    fun updateUser(id: String, updatedUser: User): User {
        return userRepository.save(updatedUser.copy(id = id))
    }

    fun deleteUser(id: String) = userRepository.deleteById(id)
}

