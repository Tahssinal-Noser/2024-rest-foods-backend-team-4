package ch.noseryoung.rest_food.domain.menucard.menucarditem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenucardItemService {

    private final MenucardItemRepository menucardItemRepository;

    @Autowired
    public MenucardItemService(MenucardItemRepository menucardItemRepository) {
        this.menucardItemRepository = menucardItemRepository;
    }

    /**
     * Returns all menu card items from the database.
     * @return list of menu card items
     */ 
    public List<MenucardItem> getAllMenucardItems() {
        return menucardItemRepository.findAll();
    }

    /**
     * Retrieves a menu card item by its ID or throws an error if not found.
     * @param id ID of the menu card item to retrieve
     * @return the found menu card item
     * @throws IllegalArgumentException if no item found with the given ID
     */
    public MenucardItem getMenucardItemById(Long id) {
        return menucardItemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("MenucardItem not found for this id: " + id));
    }

    /**
     * Creates and saves a new menu card item.
     * @param menucardItem details of the new menu card item to save
     * @return the saved menu card item
     */
    public MenucardItem createMenucardItem(MenucardItem menucardItem) {
        return menucardItemRepository.save(menucardItem);
    }

    /**
     * Updates an existing menu card item with new details, if it exists.
     * @param id ID of the menu card item to update
     * @param menucardItemDetails new details to update the item
     * @return the updated menu card item
     * @throws IllegalArgumentException if the item is not found
     */
    public MenucardItem updateMenucardItem(Long id, MenucardItem menucardItemDetails) {
        MenucardItem menucardItem = getMenucardItemById(id);
        menucardItem.setName(menucardItemDetails.getName());
        menucardItem.setDescription(menucardItemDetails.getDescription());
        menucardItem.setImage(menucardItemDetails.getImage());
        menucardItem.setPrice(menucardItemDetails.getPrice());
        menucardItem.setCategory(menucardItemDetails.getCategory());
        menucardItem.setChefsChoice(menucardItemDetails.getChefsChoice());
        return menucardItemRepository.save(menucardItem);
    }

    /**
     * Deletes a specific menu card item by ID.
     * @param id ID of the menu card item to delete
     * @throws IllegalArgumentException if the item is not found
     */
    public void deleteMenucardItem(Long id) {
        MenucardItem menucardItem = getMenucardItemById(id);
        menucardItemRepository.delete(menucardItem);
    }
}