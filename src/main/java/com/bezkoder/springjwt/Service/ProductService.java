package com.bezkoder.springjwt.Service;


import com.bezkoder.springjwt.models.Products;
import com.bezkoder.springjwt.models.WishList;
import com.bezkoder.springjwt.repository.BikeRepo;
import com.bezkoder.springjwt.repository.WishListRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final BikeRepo bikeRepo;
    private final WishListRepo wishListRepo;

    public void saveBikes(Products products) {
        bikeRepo.save(products);
    }

    public List<Products> getBikes() {
        return bikeRepo.findAll();
    }

    public List<WishList> getwishList() {
        return wishListRepo.findAll();
    }

    public void saveItem(WishList wish) {
        wishListRepo.save(wish);
    }
}
