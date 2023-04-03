package com.hugsy.ecommercebackend.repository;

import com.hugsy.ecommercebackend.model.LocalUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<LocalUser, Long> {
}
