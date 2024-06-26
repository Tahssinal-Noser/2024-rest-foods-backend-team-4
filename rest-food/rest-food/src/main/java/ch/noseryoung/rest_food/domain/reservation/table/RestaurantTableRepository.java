package ch.noseryoung.rest_food.domain.reservation.table;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantTableRepository extends JpaRepository<RestaurantTable, Integer> {
}

