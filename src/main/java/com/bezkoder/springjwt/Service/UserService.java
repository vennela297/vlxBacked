package com.bezkoder.springjwt.Service;


import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.UserRepository;
import com.bezkoder.springjwt.repository.WishListRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final WishListRepo wishListRepo;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void removeUser(Long id) {
        userRepository.deleteById(id);
    }

    public void removeItem(Integer id) {
        wishListRepo.deleteById(id);
    }
}
