package com.example.CrudApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/users")
    public String ekle(@RequestBody Usersss usersss) {
        userRepository.save(usersss);
        return "Kullanıcı başarıyla eklendi.";
    }
     @GetMapping("/users")
     public List<Usersss> getAllUsers() {
       return userRepository.findAll();
    }


    @GetMapping("/users/{id}")
    //Optional-Listten farkı tek kullanıcı döndürmesi.List birden fazla.
    public Optional<Usersss> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }
    @PutMapping("/users/{id}")
    public Usersss updateUser(@PathVariable Long id, @RequestBody Usersss user) {
        user.setId(id);
        return userRepository.save(user);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }


}
