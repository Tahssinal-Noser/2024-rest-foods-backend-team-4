package ch.noseryoung.rest_food.domain.reservation;


import ch.noseryoung.rest_food.domain.reservation.table.RestaurantTable;
import ch.noseryoung.rest_food.domain.reservation.table.RestaurantTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


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

    /**
     * Updates the details of an existing reservation. If a new table is specified and exists,
     * it assigns the reservation to that table. An error is thrown if the reservation or table
     * does not exist.
     *
     * @param reservationId the ID of the reservation to update
     * @param reservationDetails updated properties for the reservation
     * @return the updated reservation
     * @throws ResponseStatusException if the reservation or specified table ID is not found
     */

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

        public void deleteReservation(Long reservationId){
            Reservation reservation = getReservationById(reservationId);
            reservationRepository.delete(reservation);
        }

        public List<Reservation> getAllReservations(){
            return  reservationRepository.findAll();
        }
}
