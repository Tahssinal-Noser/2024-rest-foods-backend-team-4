package ch.noseryoung.rest_food.domain.menucard.menucarditem;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menucarditems")
public class MenucardItemController {

    private final MenucardItemService menucardItemService;

    @Autowired
    public MenucardItemController(MenucardItemService menucardItemService) {
        this.menucardItemService = menucardItemService;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping
    @Operation(
            summary = "Get all menu card items",
            description = "This endpoint allows you to retrieve a list of all menu card items."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Menu card items retrieved successfully")
    })
    public ResponseEntity<List<MenucardItem>> getAllMenucardItems() {
        List<MenucardItem> menucardItems = menucardItemService.getAllMenucardItems();
        return ResponseEntity.ok(menucardItems);
    }


    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/{id}")
    @Operation(
            summary = "Get a menu card item by ID",
            description = "This endpoint allows you to retrieve the details of a menu card item by providing the item ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Menu card item retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Menu card item not found")
    })
    public ResponseEntity<MenucardItem> getMenucardItem(@PathVariable Long id) {
        MenucardItem menucardItem = menucardItemService.getMenucardItemById(id);
        return ResponseEntity.ok(menucardItem);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping
    @Operation(
            summary = "Create a new menu card item",
            description = "This endpoint allows you to create a new menu card item by providing the item details."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Menu card item created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<MenucardItem> createMenucardItem(@RequestBody MenucardItem menucardItem) {
        MenucardItem createdMenucardItem = menucardItemService.createMenucardItem(menucardItem);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMenucardItem);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/{id}")
    @Operation(
            summary = "Update an existing menu card item by ID",
            description = "This endpoint allows you to update the details of an existing menu card item by providing the item ID and the updated details."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Menu card item updated successfully"),
            @ApiResponse(responseCode = "404", description = "Menu card item not found"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<MenucardItem> updateMenucardItem(@PathVariable Long id, @RequestBody MenucardItem menucardItemDetails) {
        MenucardItem updatedMenucardItem = menucardItemService.updateMenucardItem(id, menucardItemDetails);
        return ResponseEntity.ok(updatedMenucardItem);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/{id}")
    @Operation(
            summary = "Delete a menu card item by ID",
            description = "This endpoint allows you to delete a menu card item by providing the item ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Menu card item deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Menu card item not found")
    })
    public ResponseEntity<Void> deleteMenucardItem(@PathVariable Long id) {
        menucardItemService.deleteMenucardItem(id);
        return ResponseEntity.noContent().build();
    }
}
