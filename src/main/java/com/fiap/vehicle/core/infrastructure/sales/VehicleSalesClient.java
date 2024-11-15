package com.fiap.vehicle.core.infrastructure.sales;

import com.fiap.vehicle.core.domain.entity.veiculo.model.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "vehicle-sales-service", url = "${vehicle-sales-service.url}")
public interface VehicleSalesClient {

    @PostMapping("/sales/vehicles")
    Vehicle cadastrarVehicle(@RequestBody Vehicle vehicleRequest);
}
