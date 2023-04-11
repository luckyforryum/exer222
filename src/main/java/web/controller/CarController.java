package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;


@Controller

public class CarController {

    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String show(@RequestParam (value = "count", defaultValue = "5") int count, Model model) {

        List<Car> carList1 = new ArrayList<>();
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

        model.addAttribute("show1",carService.show(carList1,count));
        List<Car> car5 =  carService.show(carList1,count);
        model.addAttribute("show1",car5);

        return "/cars";
    }
}
