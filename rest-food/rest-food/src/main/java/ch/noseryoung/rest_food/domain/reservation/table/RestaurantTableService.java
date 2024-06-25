package ch.noseryoung.rest_food.domain.reservation.table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RestaurantTableService {

    private final RestaurantTableRepository restaurantTableRepository;

    @Autowired
    public RestaurantTableService(RestaurantTableRepository restaurantTableRepository) {
        this.restaurantTableRepository = restaurantTableRepository;
    }

    /**
     * Saves a new or modified restaurant table in the repository.
     * @param restaurantTable the table to save
     * @return the saved table
     */
    public RestaurantTable saveTable(RestaurantTable restaurantTable) {
        return restaurantTableRepository.save(restaurantTable);
    }

    /**
     * Retrieves a table by its ID or throws an error if it's not found.
     * @param tableId the ID of the table to find
     * @return the retrieved table
     * @throws NoSuchElementException if no table found with the specified ID
     */
    public RestaurantTable getTableById(Integer tableId) {
        return restaurantTableRepository.findById(tableId)
                .orElseThrow(() -> new NoSuchElementException("Table not found for ID: " + tableId));
    }

    /**
     * Fetches all tables from the repository.
     * @return a list of all restaurant tables
     */
    public List<RestaurantTable> getAllTables() {
        return restaurantTableRepository.findAll();
    }

    /**
     * Updates an existing table with new details. If the table doesn't exist, an exception is thrown.
     * @param tableId the ID of the table to update
     * @param tableDetails new details for the table
     * @return the updated table
     * @throws NoSuchElementException if no table found with the specified ID
     */
    public RestaurantTable updateTable(Integer tableId, RestaurantTable tableDetails) {
        RestaurantTable table = getTableById(tableId);
        table.setCapacity(tableDetails.getCapacity());
        return restaurantTableRepository.save(table);
    }

    /**
     * Deletes a table by its ID. If the table doesn't exist, an exception is thrown.
     * @param tableId the ID of the table to delete
     * @throws NoSuchElementException if no table found with the specified ID
     */
    public void deleteTable(Integer tableId) {
        RestaurantTable table = getTableById(tableId);
        restaurantTableRepository.delete(table);
    }
}
