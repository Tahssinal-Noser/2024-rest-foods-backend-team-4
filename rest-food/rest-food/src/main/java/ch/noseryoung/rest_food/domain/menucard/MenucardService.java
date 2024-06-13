package ch.noseryoung.rest_food.domain.menucard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Menucard> getMenucardById(Long id) {
        return menucardRepository.findById(id);
    }
}
