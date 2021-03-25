import java.lang.reflect.Method;
import java.util.ArrayList;


public class Garage {


    String garageName;
    ArrayList<Car> cars = new ArrayList<>();


    public Garage(String garageName) {
        this.garageName = garageName;
    }


    public void addCar(Car car) {
        cars.add(car);
    }


    public void calcSumGreenFee() {
        double res = 0;
        for (Car c : cars) {
            res += c.calcGreenFee();
        }

        System.out.println("Samlet grøn afgift for bilpark: " + res);
    }


    @Override
    public String toString() {
        return "Garage: "  + garageName +
                "\n" + cars;
    }
}
