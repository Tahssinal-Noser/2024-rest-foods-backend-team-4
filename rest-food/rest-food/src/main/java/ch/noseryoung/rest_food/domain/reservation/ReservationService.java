package ch.noseryoung.rest_food.domain.reservation;


import ch.noseryoung.rest_food.domain.reservation.table.RestaurantTable;
import ch.noseryoung.rest_food.domain.reservation.table.RestaurantTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class ReservationService{

    private final ReservationRepository reservationRepository;
    private final RestaurantTableRepository restaurantTableRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository, RestaurantTableRepository restaurantTableRepository){
        this.reservationRepository = reservationRepository;
        this.restaurantTableRepository = restaurantTableRepository;
    }
    public Reservation saveReservations(Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public Reservation getReservationById(Long reservationId){
        return reservationRepository.findById(reservationId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Reservation with ID " + reservationId + " not found"));
    }

    public Reservation updateReservation(Long reservationId, Reservation reservationDetails){

        Reservation reservation = getReservationById(reservationId);
        reservation.setStartTime(reservationDetails.getStartTime());
        reservation.setDuration(reservationDetails.getDuration());
        reservation.setPerson(reservationDetails.getPerson());
        reservation.setPhone(reservationDetails.getPhone());

        if (reservationDetails.getTable() != null && reservationDetails.getTable().getTableId() != null) {
            RestaurantTable newTable = restaurantTableRepository.findById(reservationDetails.getTable().getTableId())
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Table with ID " + reservationDetails.getTable().getTableId() + " not found"));
            reservation.setTable(newTable);
        }
        return reservationRepository.save(reservation);
    }
}
