package com.example.movieBookingSystem.repository;

import com.example.movieBookingSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RegisterUserRepository extends JpaRepository<User,Integer> {

    @Query(value = "select isRegistered from user where userId=?1", nativeQuery = true)
    boolean isUserRegistered (int userId);

    @Query(value = "select max(userId) from user",nativeQuery = true)
    int getMaxID();

    @Query(value = "insert into user values(?1,?2,?3,?4,true,false,?5)")
    void addNewUser(int userId,String userName,String emailId, String password, String contact);
}
