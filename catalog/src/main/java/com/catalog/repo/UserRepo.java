package com.catalog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalog.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> 
{
	User findByName(String name);
	User findByMailid(String mailid);
}
