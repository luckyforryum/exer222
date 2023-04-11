package web.service;

import model.Car;

import java.util.List;

public interface CarService {
    public List<Car> showAll();
    public List<Car> show(List<?> list, int count);
}
