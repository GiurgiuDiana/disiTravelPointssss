package com.university.disi.service.impl;

import com.university.disi.dto.ObjectiveDTO;

import com.university.disi.dto.ObjectiveFilterDTO;
import com.university.disi.entity.Comments;
import com.university.disi.entity.Location;
import com.university.disi.entity.Objective;
import com.university.disi.entity.Wishlist;
import com.university.disi.repository.LocationRepository;
import com.university.disi.repository.ObjectiveRepository;
import com.university.disi.repository.WishlistRepository;
import com.university.disi.service.ObjectiveService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

@Service(value = "registeredObjectiveService")
public class ObjectiveServiceImpl  implements ObjectiveService {

    @Autowired
    private ObjectiveRepository registeredObjectiveRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private WishlistRepository wishlistRepository;

    @Override
    public Objective save(ObjectiveDTO obj) {
        Objective newObj= new Objective();

        newObj.setName(obj.getName());
        newObj.setAddress(obj.getAddress());
        newObj.setCategory(obj.getCategory());

        Optional<Location> optionalLocation = locationRepository.findById(obj.getLocationId());
        Location location = optionalLocation.isPresent() ? optionalLocation.get() : null;
        newObj.setLocation(location);


        return registeredObjectiveRepository.save(newObj);
    }

    public ObjectiveDTO edit(ObjectiveDTO obj) {
        Objective newObj= new Objective();

        newObj.setName(obj.getName());
        newObj.setAddress(obj.getAddress());
        newObj.setCategory(obj.getCategory());

        Optional<Location> optionalLocation = locationRepository.findById(obj.getLocationId());
        Location location = optionalLocation.isPresent() ? optionalLocation.get() : null;
        newObj.setLocation(location);

        Optional<Wishlist> optionalWishlist = wishlistRepository.findByName("My wishlist");
        Wishlist wishlist = optionalWishlist.isPresent() ? optionalWishlist.get() : null;
        newObj.setWishlist(wishlist);


        if (newObj != null) {
            BeanUtils.copyProperties(obj, newObj, "location_id","location");
            registeredObjectiveRepository.save(newObj);
        }
        return obj;
//        return registeredObjectiveRepository.save(newObj);
    }


    @Override
    public List<Objective> findAll() {
        List<Objective> listObjective= new ArrayList<>();
        return registeredObjectiveRepository.findAll();
    }

    @Override
    public void delete(int id) {
        registeredObjectiveRepository.deleteById(id);

    }

    @Override
    public Objective findById(int id) {
        Optional<Objective> optionalObjective= registeredObjectiveRepository.findById(id);
        return optionalObjective.isPresent() ? optionalObjective.get() : null;
    }

    @Override
    public ObjectiveDTO update(ObjectiveDTO objectivDTO)
    {

        Objective editableObjective = findById(objectivDTO.getId());
        Objective newObj= new Objective();
         newObj=editableObjective;
        if(objectivDTO.getWishlistDTO()!=null) {

            newObj.setName(objectivDTO.getName());
            newObj.setAddress(objectivDTO.getAddress());
            newObj.setCategory(objectivDTO.getCategory());


            Optional<Location> optionalLocation = locationRepository.findById(objectivDTO.getLocationId());
            Location location = optionalLocation.isPresent() ? optionalLocation.get() : null;
            newObj.setLocation(location);
            Optional<Wishlist> optionalWishlist = wishlistRepository.findByName(objectivDTO.getWishlistDTO().getName());
            String numeWishlist = objectivDTO.getWishlistDTO().getName();
            Wishlist wishlist = optionalWishlist.isPresent() ? optionalWishlist.get() : null;
            newObj.setWishlist(wishlist);
        }else{
            newObj=editableObjective;
        }

        if (editableObjective != null) {
            BeanUtils.copyProperties(objectivDTO, newObj, "location_id","location","touristId","tourist");
            registeredObjectiveRepository.save(newObj);
        }
        return objectivDTO;

    }
    @Override
    public List<Objective> searchObjectives(ObjectiveFilterDTO objectiveFilterDTO) {
        return registeredObjectiveRepository.findAll()
                .stream()
                .filter(o -> o.getLocation().equals(objectiveFilterDTO.getLocationName()) || objectiveFilterDTO.getLocationName().isEmpty())
                .filter(o -> o.getCategory().equals(objectiveFilterDTO.getCategoryName()) || objectiveFilterDTO.getCategoryName().isEmpty())
                .collect(Collectors.toList());
    }
}
