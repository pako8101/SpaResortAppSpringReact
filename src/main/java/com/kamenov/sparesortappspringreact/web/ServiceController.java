package com.kamenov.sparesortappspringreact.web;

import com.kamenov.sparesortappspringreact.models.entity.ServiceEntity;
import com.kamenov.sparesortappspringreact.service.ServiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {
    private final ServiceService service;

    public ServiceController(ServiceService service) {
        this.service = service;
    }

    @GetMapping
    public List<ServiceEntity> getAllServices() {
        return service.getAllServices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceEntity> getServiceById(@PathVariable Long id) {
        return service.getServiceById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ServiceEntity createService(@RequestBody ServiceEntity serviceEntity) {
        return service.saveService(serviceEntity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServiceEntity> updateService(
            @PathVariable Long id,
            @RequestBody ServiceEntity updatedService) {
        return service.getServiceById(id)
                .map(existingService -> {
                    existingService.setName(updatedService.getName());
                    existingService.setDescription(updatedService.getDescription());
                    service.saveService(existingService);
                    return ResponseEntity.ok(existingService);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteService(@PathVariable Long id) {
        if (service.getServiceById(id).isPresent()) {
            service.deleteService(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}



