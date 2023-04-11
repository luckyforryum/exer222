package web.dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaiImp implements CarDao {

    @Override
    public int countCar(List<?> list) {
        return list.size();
    }




    @Override
    public List<Car> show(List<?> list, int count) {
        return count >= 5 ? (List<Car>) list.stream().collect(Collectors.toList()) : (List<Car>) list.stream().limit(count).collect(Collectors.toList());
    }
}
