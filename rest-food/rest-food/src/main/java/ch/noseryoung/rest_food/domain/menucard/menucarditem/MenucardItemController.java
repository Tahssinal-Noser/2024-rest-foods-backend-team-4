package ch.noseryoung.rest_food.domain.menucard.menucarditem;

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

    @GetMapping
    public ResponseEntity<List<MenucardItem>> getAllMenucardItems() {
        List<MenucardItem> menucardItems = menucardItemService.getAllMenucardItems();
        return ResponseEntity.ok(menucardItems);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MenucardItem> getMenucardItem(@PathVariable Long id) {
       MenucardItem menucardItem = menucardItemService.getMenucardItemById(id);

        return ResponseEntity.ok(menucardItem);
    }

    @PostMapping
    public ResponseEntity<MenucardItem> createMenucardItem(@RequestBody MenucardItem menucardItem) {
        MenucardItem createdMenucardItem = menucardItemService.createMenucardItem(menucardItem);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMenucardItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MenucardItem> updateMenucardItem(@PathVariable Long id, @RequestBody MenucardItem menucardItemDetails) {
        MenucardItem updatedMenucardItem = menucardItemService.updateMenucardItem(id, menucardItemDetails);
        return ResponseEntity.ok(updatedMenucardItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenucardItem(@PathVariable Long id) {
        menucardItemService.deleteMenucardItem(id);
        return ResponseEntity.noContent().build();
    }
}
