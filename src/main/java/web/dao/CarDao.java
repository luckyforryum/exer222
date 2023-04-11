package web.dao;

import model.Car;

import java.util.List;

public interface CarDao {
    public int countCar(List<?> list);


    public List<Car> show(List<?> list, int count);
}
