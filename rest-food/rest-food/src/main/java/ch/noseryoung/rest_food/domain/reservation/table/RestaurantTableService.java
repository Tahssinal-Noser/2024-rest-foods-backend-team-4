package ch.noseryoung.rest_food.domain.reservation.table;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantTableService {

    private final RestaurantTableRepository restaurantTableRepository;

    @Autowired
    public RestaurantTableService(RestaurantTableRepository restaurantTableRepository){
        this.restaurantTableRepository = restaurantTableRepository;
    }

    public RestaurantTable saveTable(RestaurantTable restaurantTable){
        return  restaurantTableRepository.save(restaurantTable);
    }

}
