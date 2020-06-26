package com.group24.demo.repository;

import com.group24.demo.entity.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendsRepository extends JpaRepository<Friends,Integer> {
}
