package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.Service.ProductService;
import com.bezkoder.springjwt.Service.UserService;
import com.bezkoder.springjwt.models.Products;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.models.WishList;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/vlx")
@AllArgsConstructor
public class productController {
    private final ProductService productService;
    private final UserService userService;

    @PostMapping("/saveBike")
    public void saveBikes(@RequestBody Products products)
    {
         productService.saveBikes(products);
    }

    @GetMapping("/getBikes")
    public List<Products> getBikes()
    {
        return productService.getBikes();
    }

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public void removeUser(@PathVariable("id") Long id)
    {
        userService.removeUser(id);
    }

    @DeleteMapping("/delete/{wishid}")
    public void removeItem(@PathVariable("wishid") Integer id)
    {
        userService.removeItem(id);
    }
    @GetMapping("/wishlist")
   public List<WishList> getwishList()
    {
        return productService.getwishList();
    }

    @PostMapping("/savewishlist")
    public void saveItem(@RequestBody WishList wish)
    {
        productService.saveItem(wish);
    }

}
