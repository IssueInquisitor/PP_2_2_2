package web.model;

public class Car {

    private String carBrand;
    private String carModel;
    private int number;

    public Car() {
    }

    public Car(String carBrand, String carModel, int number) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.number = number;
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

