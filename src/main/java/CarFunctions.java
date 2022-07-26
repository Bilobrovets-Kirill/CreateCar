public class CarFunctions implements CarBehavior {

    public String turnONCar() {
        return "Автомобиль заведен";
    }

    public String turnOffCar() {
        return "Автомобиль заглушен";
    }

    public Integer assignYearRelease(Integer year, Car car) {
        return car.setYear(year);
    }

    public String assignCarType(String type, Car car) {
        return car.setType(type);
    }

    public String assignCarColor(String color, Car car) {
        return car.setColor(color);
    }
}
