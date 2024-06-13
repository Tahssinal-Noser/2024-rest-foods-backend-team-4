package ch.noseryoung.rest_food.domain.reservation.table;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tables")
public class RestaurantTableController {

        private final RestaurantTableService restaurantTableService;

        @Autowired
        public RestaurantTableController(RestaurantTableService restaurantTableService) {
            this.restaurantTableService = restaurantTableService;
        }

        @PostMapping
        public ResponseEntity<RestaurantTable> createBlog(@RequestBody RestaurantTable restaurantTable) {
            return ResponseEntity.status(201).body(restaurantTableService.saveTable(restaurantTable));
        }
}
