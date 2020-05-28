package com.university.disi.service.impl;

import com.university.disi.dto.WishlistDTO;
import com.university.disi.entity.Objective;
import com.university.disi.entity.Wishlist;
import com.university.disi.entity.loginEntity.Tourist;
import com.university.disi.repository.ObjectiveRepository;
import com.university.disi.repository.WishlistRepository;
import com.university.disi.repository.loginRepository.TouristRepository;
import com.university.disi.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service(value = "registeredWishlistService")
public class WishlistServiceImpl implements WishlistService {

    @Autowired
    private WishlistRepository registeredWishlistRepository;

    @Autowired
    private TouristRepository touristRepository;


    @Autowired
    private ObjectiveRepository objectiveRepository;



    @Override
    public Wishlist save(WishlistDTO obj) {
        Wishlist newObj= new Wishlist();

        newObj.setName(obj.getName());

        Optional<Tourist> tourist = Optional.of(new Tourist());
        tourist =  touristRepository.findById(obj.getTouristId());
        Tourist tourist1 = tourist.isPresent() ? tourist.get() : null;
        newObj.setTourist(tourist1);

        return registeredWishlistRepository.save(newObj);
    }

    @Override
    public List<Wishlist> findAll() {
        List<Wishlist> listWishlist = new ArrayList<>();
        return registeredWishlistRepository.findAll();    }

    @Override
    public void delete(int id){

        Optional<Objective> optionalObjective= objectiveRepository.findById(id);

        if (optionalObjective != null) {
            //  BeanUtils.copyProperties(objectivDTO, obj, "location_id","location","wishlist","wishlist_id","visits","id_objective");
            optionalObjective.get().deleteConnectiontoWishlist();



            objectiveRepository.save(optionalObjective.get());
        }
    }

    @Override
    public Wishlist findById(int id) {
        Optional<Wishlist> optionalWishlist = registeredWishlistRepository.findById(id);
        return optionalWishlist.isPresent() ? optionalWishlist.get() : null;    }

    @Override
    public void update(int id, WishlistDTO wishlistDTO) {
        Optional<Wishlist> wishlistToBeUpdated = registeredWishlistRepository.findById(id);
        wishlistToBeUpdated.get().setName(wishlistDTO.getName());

        registeredWishlistRepository.save(wishlistToBeUpdated.get());
    }

    @Override
    public Wishlist findByName(String name) {
        Optional<Wishlist> optionalWishlist = registeredWishlistRepository.findByName(name);
        return optionalWishlist.isPresent() ? optionalWishlist.get() : null;    }


}
