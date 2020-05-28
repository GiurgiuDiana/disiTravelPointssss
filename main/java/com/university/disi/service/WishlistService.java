package com.university.disi.service;

import com.university.disi.dto.WishlistDTO;
import com.university.disi.entity.Wishlist;

import java.util.List;

public interface WishlistService {
    Wishlist save(WishlistDTO obj);

    List<Wishlist> findAll();

    void delete(int id);

    Wishlist findById(int id);

    void update(int id, WishlistDTO wishlistDTO);

    Wishlist findByName(String name);
}
