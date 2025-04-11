package com.pawcare.repository;

import com.pawcare.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends MongoRepository<User, String> {

    @Query("{username:'?0'}")
    User findItemByUsername(String username);

    @Query(value="{id:'?0'}", fields="{'username' : 1, 'lastName' : 1, 'email' : 1}")
    List<User> findAll(String category);

    long count();
}
