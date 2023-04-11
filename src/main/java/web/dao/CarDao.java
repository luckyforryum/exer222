package web.dao;

import model.Car;

import java.util.List;

public interface CarDao {


    public List<Car> showAll();

    public List<Car> show(List<?> list, int count);
}
