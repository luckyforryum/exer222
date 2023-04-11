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
        List<Car> carList1 = carService.showAll();
         model.addAttribute("show1", count >= 5 ? carService.showAll() : carService.show(carList1, count));
        return "/cars";
    }
}
