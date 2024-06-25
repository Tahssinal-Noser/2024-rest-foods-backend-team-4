package ch.noseryoung.rest_food.domain.menucard;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menucards")
public class MenucardController {

    private final MenucardService menucardService;

    @Autowired
    public MenucardController(MenucardService menucardService) {
        this.menucardService = menucardService;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping
    @Operation(
            summary = "Create a new menu card",
            description = "This endpoint allows you to create a new menu card by providing the menu card details."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Menu card created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<Menucard> createMenucard(@RequestBody Menucard menucard) {
        return ResponseEntity.status(201).body(menucardService.createMenucard(menucard));
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/{menucardId}")
    @Operation(
            summary = "Update an existing menu card by ID",
            description = "This endpoint allows you to update the details of an existing menu card by providing the menu card ID and the updated details."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Menu card updated successfully"),
            @ApiResponse(responseCode = "404", description = "Menu card not found"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<Menucard> updateMenucard(@PathVariable Long menucardId, @RequestBody Menucard menucardDetails) {
        return ResponseEntity.status(200).body(menucardService.updateMenucard(menucardId, menucardDetails));
    }
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/{menucardId}")
    @Operation(
            summary = "Get a menu card by ID",
            description = "This endpoint allows you to retrieve the details of a menu card by providing the menu card ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Menu card retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Menu card not found")
    })
    public ResponseEntity<Menucard> getMenucardById(@PathVariable Long menucardId) {
        return ResponseEntity.status(200).body(menucardService.getMenucardById(menucardId));
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping
    @Operation(
            summary = "Get all menu cards",
            description = "This endpoint allows you to retrieve a list of all menu cards."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Menu cards retrieved successfully")
    })
    public ResponseEntity<List<Menucard>> getAllMenucards() {
        return ResponseEntity.status(200).body(menucardService.getAllMenucards());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/{menucardId}")
    @Operation(
            summary = "Delete a menu card by ID",
            description = "This endpoint allows you to delete a menu card by providing the menu card ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Menu card deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Menu card not found")
    })
    public ResponseEntity<Void> deleteMenucard(@PathVariable Long menucardId) {
        menucardService.deleteMenucard(menucardId);
        return ResponseEntity.status(204).build();
    }
}
