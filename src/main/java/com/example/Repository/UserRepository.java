package com.example.Repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

    //User findByEmailId(String emailId);

}
