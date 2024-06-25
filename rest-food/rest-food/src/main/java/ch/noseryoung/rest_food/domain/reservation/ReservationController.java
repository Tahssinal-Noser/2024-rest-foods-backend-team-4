package ch.noseryoung.rest_food.domain.reservation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    @Operation(
            summary = "Create a new reservation",
            description = "This endpoint allows you to create a new reservation by providing the reservation details."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Reservation created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) {
        return ResponseEntity.status(201).body(reservationService.saveReservations(reservation));
    }

    @PutMapping("/{reservationId}")
    @Operation(
            summary = "Update an existing reservation by ID",
            description = "This endpoint allows you to update the details of an existing reservation by providing the reservation ID and the updated details."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Reservation updated successfully"),
            @ApiResponse(responseCode = "404", description = "Reservation not found"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<Reservation> updateReservation(@PathVariable Long reservationId, @RequestBody Reservation reservationDetails) {
        return ResponseEntity.status(200).body(reservationService.updateReservation(reservationId, reservationDetails));
    }

    @GetMapping("/{reservationId}")
    @Operation(
            summary = "Get a reservation by ID",
            description = "This endpoint allows you to retrieve the details of a reservation by providing the reservation ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Reservation retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Reservation not found")
    })
    public ResponseEntity<Reservation> getReservationById(@PathVariable Long reservationId) {
        return ResponseEntity.status(200).body(reservationService.getReservationById(reservationId));
    }

    @GetMapping
    @Operation(
            summary = "Get all reservations",
            description = "This endpoint allows you to retrieve a list of all reservations."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Reservations retrieved successfully")
    })
    public ResponseEntity<List<Reservation>> getAllReservations() {
        return ResponseEntity.status(200).body(reservationService.getAllReservations());
    }

    @DeleteMapping("/{reservationId}")
    @Operation(
            summary = "Delete a reservation by ID",
            description = "This endpoint allows you to delete a reservation by providing the reservation ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Reservation deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Reservation not found")
    })
    public ResponseEntity<Void> deleteReservation(@PathVariable Long reservationId) {
        reservationService.deleteReservation(reservationId);
        return ResponseEntity.status(204).build();
    }
}
