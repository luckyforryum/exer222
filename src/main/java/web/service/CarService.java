package web.service;

import model.Car;

import java.util.List;

public interface CarService {
    public int countCar(List<?> list);
    public List<Car> show(List<?> list, int count);
}
