package ch.noseryoung.rest_food.domain.menucard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MenucardService {

    private final MenucardRepository menucardRepository;

    @Autowired
    public MenucardService(MenucardRepository menucardRepository) {
        this.menucardRepository = menucardRepository;
    }

    /**
     * Fetches all available menu cards.
     * @return list of menu cards
     */
    public List<Menucard> getAllMenucards() {
        return menucardRepository.findAll();
    }

    /**
     * Finds a menu card by its ID, throws an exception if not found.
     * @param menucardId unique identifier of the menu card
     * @return the found menu card
     * @throws ResponseStatusException if the menu card does not exist
     */
    public Menucard getMenucardById(Long menucardId) {
        return menucardRepository.findById(menucardId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Menucard not found"));
    }

    /**
     * Creates and stores a new menu card.
     * @param menucard details of the new menu card
     * @return the newly created menu card
     */
    public Menucard createMenucard(Menucard menucard) {
        return menucardRepository.save(menucard);
    }

    /**
     * Updates an existing menu card with new details.
     * @param menucardId the ID of the menu card to be updated
     * @param menucardDetails new details to update
     * @return the updated menu card
     */
    public Menucard updateMenucard(Long menucardId, Menucard menucardDetails) {
        Menucard existingMenucard = getMenucardById(menucardId);
        existingMenucard.setName(menucardDetails.getName());
        return menucardRepository.save(existingMenucard);
    }

    /**
     * Deletes a menu card by its ID.
     * @param menucardId the ID of the menu card to be deleted
     */
    public void deleteMenucard(Long menucardId) {
        Menucard existingMenucard = getMenucardById(menucardId);
        menucardRepository.delete(existingMenucard);
    }
}
