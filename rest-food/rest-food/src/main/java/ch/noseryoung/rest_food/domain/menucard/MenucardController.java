package ch.noseryoung.rest_food.domain.menucard;

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

    @PostMapping
    public ResponseEntity<Menucard> createMenucard(@RequestBody Menucard menucard) {
        return ResponseEntity.status(201).body(menucardService.createMenucard(menucard));
    }

    @PutMapping("/{menucardId}")
    public ResponseEntity<Menucard> updateMenucard(@PathVariable Long menucardId, @RequestBody Menucard menucardDetails) {
        return ResponseEntity.status(201).body(menucardService.updateMenucard(menucardId, menucardDetails));
    }

    @GetMapping("/{menucardId}")
    public ResponseEntity<Menucard> getMenucardById(@PathVariable Long menucardId) {
        return ResponseEntity.status(200).body(menucardService.getMenucardById(menucardId));
    }

    @GetMapping
    public ResponseEntity<List<Menucard>> getAllMenucards() {
        return ResponseEntity.status(200).body(menucardService.getAllMenucards());
    }

    @DeleteMapping("/{menucardId}")
    public ResponseEntity<Void> deleteMenucard(@PathVariable Long menucardId) {
        menucardService.deleteMenucard(menucardId);
        return ResponseEntity.status(204).build();
    }
}
