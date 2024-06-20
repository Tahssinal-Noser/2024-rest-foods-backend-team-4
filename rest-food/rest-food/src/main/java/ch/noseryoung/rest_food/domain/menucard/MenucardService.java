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

    public List<Menucard> getAllMenucards() {
        return menucardRepository.findAll();
    }

    public Menucard getMenucardById(Long menucardId) {
        return menucardRepository.findById(menucardId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Menucard not found for this id: " + menucardId));
    }

    public Menucard createMenucard(Menucard menucard) {
        return menucardRepository.save(menucard);
    }

    public Menucard updateMenucard(Long menucardId, Menucard menucardDetails) {
        Menucard menucard = getMenucardById(menucardId);
        menucard.setName(menucardDetails.getName());
        return menucardRepository.save(menucard);
    }

    public void deleteMenucard(Long menucardId) {
        Menucard menucard = getMenucardById(menucardId);
        menucardRepository.delete(menucard);
    }
}
