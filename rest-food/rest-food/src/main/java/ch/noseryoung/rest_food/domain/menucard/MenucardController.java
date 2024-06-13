package ch.noseryoung.rest_food.domain.menucard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @GetMapping
    public ResponseEntity<List<Menucard>> getAllMenucards() {
        List<Menucard> menucards = menucardService.getAllMenucards();
        return ResponseEntity.ok(menucards);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Menucard> getMenucardById(@PathVariable Long id) {
        Menucard menucard = menucardService.getMenucardById(id).orElse(null);
        return ResponseEntity.ok(menucard);
    }

    /**
     * complete crud get request
     *
     * TODO: finish all Crud request (delete, post, put)
     */

}
