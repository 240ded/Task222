package web.config.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

    @Override
    public List<Car> returnCars(int carCount) {
        if (carCount == 0 || carCount > 5) return (new Car()).getCarList();
        return (new Car()).getCarList().stream().limit(carCount).collect(Collectors.toList());
    }
}
