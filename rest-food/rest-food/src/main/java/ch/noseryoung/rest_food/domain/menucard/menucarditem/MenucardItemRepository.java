package ch.noseryoung.rest_food.domain.menucard.menucarditem;

import ch.noseryoung.rest_food.domain.menucard.menucarditem.MenucardItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenucardItemRepository extends JpaRepository<MenucardItem, Long> {
}
