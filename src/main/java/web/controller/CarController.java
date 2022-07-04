package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDAO;


@Controller
public class CarController {

    private final CarsDAO carsDAO;

    @Autowired
    public CarController(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int cars, Model model) {

        model.addAttribute("list", carsDAO.carCount(cars));
        return "cars";

    }
}
