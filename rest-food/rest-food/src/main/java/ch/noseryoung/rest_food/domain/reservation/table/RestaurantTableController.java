package ch.noseryoung.rest_food.domain.reservation.table;


import ch.noseryoung.rest_food.domain.reservation.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tables")
public class RestaurantTableController {

        private final RestaurantTableService restaurantTableService;

        @Autowired
        public RestaurantTableController(RestaurantTableService restaurantTableService) {
            this.restaurantTableService = restaurantTableService;
        }

        @PostMapping
        public ResponseEntity<RestaurantTable> createTable(@RequestBody RestaurantTable restaurantTable) {
            return ResponseEntity.status(201).body(restaurantTableService.saveTable(restaurantTable));
        }

    @PutMapping("/{tableId}")
    public ResponseEntity<RestaurantTable> updateTable(@PathVariable Integer tableId, @RequestBody RestaurantTable tableDetails) {
        return ResponseEntity.status(201).body(restaurantTableService.updateTable(tableId, tableDetails));
    }

    @GetMapping("/{tableId}")
    public ResponseEntity<RestaurantTable> getTableById(@PathVariable Integer tableId) {
        return ResponseEntity.status(200).body(restaurantTableService.getTableById(tableId));
    }

    @GetMapping
    public ResponseEntity<List<RestaurantTable>> getAllTables() {
        return ResponseEntity.status(200).body(restaurantTableService.getAllTables());
    }

    @DeleteMapping("/{tableId}")
    public ResponseEntity<Void> deleteTable(@PathVariable Integer tableId) {
       restaurantTableService.deleteTable(tableId);
        return ResponseEntity.status(204).build();
    }

}
