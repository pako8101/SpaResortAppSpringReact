package com.kamenov.sparesortappspringreact.web;

import com.kamenov.sparesortappspringreact.models.entity.AccommodationEntity;
import com.kamenov.sparesortappspringreact.service.AccommodationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accommodations")
public class AccommodationController {
    private final AccommodationService service;

    public AccommodationController(AccommodationService service) {
        this.service = service;
    }

    @GetMapping
    public List<AccommodationEntity> getAllAccommodations() {
        return service.getAllAccommodations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccommodationEntity> getAccommodationById(@PathVariable Long id) {
        return service.getAccommodationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AccommodationEntity createAccommodation(@RequestBody AccommodationEntity accommodation) {
        return service.saveAccommodation(accommodation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccommodationEntity> updateAccommodation(
            @PathVariable Long id,
            @RequestBody AccommodationEntity updatedAccommodation) {
        return service.getAccommodationById(id)
                .map(existingAccommodation -> {
                    existingAccommodation.setCapacity(updatedAccommodation.getCapacity());
                    existingAccommodation.setName(String.valueOf(updatedAccommodation.setName("Firu")));
                    existingAccommodation.setPricePerNight(updatedAccommodation.getPricePerNight());
                    service.saveAccommodation(existingAccommodation);
                    return ResponseEntity.ok(existingAccommodation);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccommodation(@PathVariable Long id) {
        if (service.getAccommodationById(id).isPresent()) {
            service.deleteAccommodation(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

