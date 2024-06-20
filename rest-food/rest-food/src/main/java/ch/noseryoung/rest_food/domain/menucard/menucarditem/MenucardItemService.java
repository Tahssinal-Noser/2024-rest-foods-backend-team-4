package ch.noseryoung.rest_food.domain.menucard.menucarditem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MenucardItemService {

    private final MenucardItemRepository menucardItemRepository;

    @Autowired
    public MenucardItemService(MenucardItemRepository menucardItemRepository) {
        this.menucardItemRepository = menucardItemRepository;
    }

    public List<MenucardItem> getAllMenucardItems() {
        return menucardItemRepository.findAll();
    }

    public Optional<MenucardItem> getMenucardItemById(Long id) {
        return menucardItemRepository.findById(id);
    }

    public MenucardItem createMenucardItem(MenucardItem menucardItem) {
        return menucardItemRepository.save(menucardItem);
    }

    public MenucardItem updateMenucardItem(Long id, MenucardItem menucardItemDetails) {
        MenucardItem menucardItem = menucardItemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("MenucardItem not found for this id: " + id));
        menucardItem.setName(menucardItemDetails.getName());
        menucardItem.setDescription(menucardItemDetails.getDescription());
        menucardItem.setImage(menucardItemDetails.getImage());
        menucardItem.setPrice(menucardItemDetails.getPrice());
        menucardItem.setCategory(menucardItemDetails.getCategory());
        menucardItem.setChefsChoice(menucardItemDetails.getChefsChoice());
        return menucardItemRepository.save(menucardItem);
    }

    public void deleteMenucardItem(Long id) {
        MenucardItem menucardItem = menucardItemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("MenucardItem not found for this id: " + id));
        menucardItemRepository.delete(menucardItem);
    }
}
