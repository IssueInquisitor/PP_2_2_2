package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {

    private final List<Car> list;


    {
        list = new ArrayList<>();

        list.add(new Car("Brand1", "Model1", 111));
        list.add(new Car("Brand2", "Model2", 222));
        list.add(new Car("Brand3", "Model3", 333));
        list.add(new Car("Brand4", "Model4", 444));
        list.add(new Car("Brand5", "Model5", 555));
    }

    public List<Car> carCount(int n) {
        if (n == 0) return null;
        if (n > list.size()) return list;
        return list.stream().limit(n).collect(Collectors.toList());
    }
}
