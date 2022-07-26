public class Car {
    private String type;
    private String color;
    private Integer year;

    public Car() {
    }

    public String getType() {
        return type;
    }

    public String setType(String type) {
        this.type = type;
        return type;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        this.color = color;
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public Integer setYear(Integer year) {
        this.year = year;
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
