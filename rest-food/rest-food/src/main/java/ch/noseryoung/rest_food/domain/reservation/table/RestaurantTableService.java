package ch.noseryoung.rest_food.domain.reservation.table;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

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

    public RestaurantTable getTableById(Integer tableId){
        return restaurantTableRepository.findById(tableId)
                .orElseThrow(() -> new NoSuchElementException(""));
    }

    public List<RestaurantTable> getAllTables(){
        return restaurantTableRepository.findAll();
    }

    public RestaurantTable updateTable(Integer tableId, RestaurantTable tableDetails){
        RestaurantTable table = getTableById(tableId);
        table.setCapacity(tableDetails.getCapacity());
        return restaurantTableRepository.save(table);
    }

    public void deleteTable(Integer tableId){
        RestaurantTable table = getTableById(tableId);
        restaurantTableRepository.delete(table);
    }

}
