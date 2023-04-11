package web.dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaiImp implements CarDao {


    @Override
    public List<Car> showAll() {
        return carList1;
    }


    @Override
    public List<Car> show(List<?> list, int count) {
        return  (List<Car>) list.stream().limit(count).collect(Collectors.toList());
    }

    private List<Car> carList1 = new ArrayList<>();
    {
        carList1.add(new Car(1,"BMW",111));
        carList1.add(new Car(2,"AUDI",222));
        carList1.add(new Car(3,"LADA",333));
        carList1.add(new Car(4,"MAZDA",444));
        carList1.add(new Car(5,"TOYOTA",555));
        carList1.add(new Car(6,"KIA",666));
        carList1.add(new Car(7,"KIA",777));
        carList1.add(new Car(8,"KIA",888));
        carList1.add(new Car(9,"KIA",999));
        carList1.add(new Car(10,"KIA",1010));
        carList1.add(new Car(11,"KIA",1111));
        carList1.add(new Car(12,"KIA",1212));
    }



}
