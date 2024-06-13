package ch.noseryoung.rest_food.domain.reservation;
import ch.noseryoung.rest_food.domain.reservation.table.RestaurantTable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name= "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationId;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "duration", nullable = false)
    private Integer duration; //in minutes

    @Column(name = "person", nullable = false)
    @Size(min = 1, max = 45)
    private String person;

    @Column(name = "phone")
    @Size(min=8,max=20)
    private String phone;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "table_id", nullable = false)
    private RestaurantTable table;

}
