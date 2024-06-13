package ch.noseryoung.rest_food.domain.reservation.table;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "restaurant_table")
@Getter
@Setter
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tableId;

    @Column(name = "number", nullable = false, unique = true)
    private Integer number;

    @Column(name = "capacity", nullable = false)
    private int capacity;

}

