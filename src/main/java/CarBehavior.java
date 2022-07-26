public interface CarBehavior {
    Integer assignYearRelease(Integer year, Car car);

    String assignCarType(String type, Car car);

    String assignCarColor(String color, Car car);
}
