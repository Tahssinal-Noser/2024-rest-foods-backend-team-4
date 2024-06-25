package ch.noseryoung.rest_food.domain.reservation.table;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
    @Operation(
            summary = "Create a new restaurant table",
            description = "This endpoint allows you to create a new restaurant table by providing the table details."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Table created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<RestaurantTable> createTable(@RequestBody RestaurantTable restaurantTable) {
        return ResponseEntity.status(201).body(restaurantTableService.saveTable(restaurantTable));
    }

    @PutMapping("/{tableId}")
    @Operation(
            summary = "Update an existing restaurant table by ID",
            description = "This endpoint allows you to update the details of an existing restaurant table by providing the table ID and the updated details."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Table updated successfully"),
            @ApiResponse(responseCode = "404", description = "Table not found"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<RestaurantTable> updateTable(@PathVariable Integer tableId, @RequestBody RestaurantTable tableDetails) {
        return ResponseEntity.status(200).body(restaurantTableService.updateTable(tableId, tableDetails));
    }

    @GetMapping("/{tableId}")
    @Operation(
            summary = "Get a restaurant table by ID",
            description = "This endpoint allows you to retrieve the details of a restaurant table by providing the table ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Table retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Table not found")
    })
    public ResponseEntity<RestaurantTable> getTableById(@PathVariable Integer tableId) {
        return ResponseEntity.status(200).body(restaurantTableService.getTableById(tableId));
    }

    @GetMapping
    @Operation(
            summary = "Get all restaurant tables",
            description = "This endpoint allows you to retrieve a list of all restaurant tables."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tables retrieved successfully")
    })
    public ResponseEntity<List<RestaurantTable>> getAllTables() {
        return ResponseEntity.status(200).body(restaurantTableService.getAllTables());
    }

    @DeleteMapping("/{tableId}")
    @Operation(
            summary = "Delete a restaurant table by ID",
            description = "This endpoint allows you to delete a restaurant table by providing the table ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Table deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Table not found")
    })
    public ResponseEntity<Void> deleteTable(@PathVariable Integer tableId) {
        restaurantTableService.deleteTable(tableId);
        return ResponseEntity.status(204).build();
    }
}
