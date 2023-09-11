package com.example.CrudApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//ilk parametre tablosu oluşturulacak sınıf,ikinci parametre primary keyin türü.
@Repository
public interface UserRepository extends JpaRepository<Usersss, Long> {
}



