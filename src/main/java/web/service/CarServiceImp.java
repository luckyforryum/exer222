package web.service;

import model.Car;
import web.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public int countCar(List<?> list) {
        return carDao.countCar(list);
    }

    @Override
    public List<Car> show(List<?> list, int count) {
        return (List<Car>) carDao.show(list,count);
    }
}
