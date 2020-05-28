package com.university.disi.controller;

import com.university.disi.dto.WishlistDTO;
import com.university.disi.entity.Wishlist;
import com.university.disi.response.ApiResponse;
import com.university.disi.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/wishlist")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @PostMapping
    public ApiResponse<Wishlist> saveWishlist(@RequestBody WishlistDTO obj){
        return new ApiResponse<>(HttpStatus.OK.value(), "Wishlist saved successfully.", wishlistService.save(obj));
    }

    @GetMapping
    public ApiResponse<List<Wishlist>> listWishlist(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Wishlist list fetched successfully.", wishlistService.findAll());
    }

    @GetMapping("/name/{name}")
    public ApiResponse<List<Wishlist>> getWishListByName(@PathVariable String name  ){
        return new ApiResponse<>(HttpStatus.OK.value(), "Wishlist fetched successfully.",wishlistService.findByName(name));
    }
    @GetMapping("/{id}")
    public ApiResponse<Wishlist> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "Wishlist fetched successfully.", wishlistService.findById(id));
    }


    @PutMapping("/{id}")
    public ApiResponse<WishlistDTO> update(@PathVariable int id, @RequestBody WishlistDTO wishlistDTO) {
        wishlistService.update(id, wishlistDTO);
        return new ApiResponse<>(HttpStatus.OK.value(), "Wishlist updated successfully.", null);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        wishlistService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "Wishlist deleted successfully.", null);
    }

}
