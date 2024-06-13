package ch.noseryoung.rest_food.domain.menucard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenucardRepository extends JpaRepository<Menucard, Long> {

    /*

    @Query("SELECT m FROM Menucard m LEFT JOIN FETCH m.items WHERE m.id = :id")
    Menucard findByIdWithItems(Long id);

    @Query("SELECT m FROM Menucard m")
    List<Menucard> findAllMenucards();
    */

}
