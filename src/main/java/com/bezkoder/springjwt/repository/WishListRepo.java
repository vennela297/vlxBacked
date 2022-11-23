package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepo extends JpaRepository<WishList,Integer> {
}
