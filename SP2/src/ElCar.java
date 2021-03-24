public class ElCar extends Car {

    int batteryCapacityKWh;
    int maxKm;
    int whPrKm;
    double kmPrL = (whPrKm/91.25)/100;


    public ElCar(int regNo, String brand, String model, int year, int amountDoors, int batteryCapacityKWh,
                      int maxKm, int whPrKm, double kmPrL) {

        super(regNo, brand, model, year, amountDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
        this.kmPrL = kmPrL;

    }

    public double calcGreenFee()    {

        if (this.kmPrL < 5)  {
            return 10470;
        }
        else if (5 <= this.kmPrL && this.kmPrL < 10)   {
            return 5500;
        }
        else if (10 <= this.kmPrL && this.kmPrL < 15) {
            return 2340;
        }
        else if (15 <= this.kmPrL && this.kmPrL < 20) {
            return 1050;
        }
        else if (20 <= this.kmPrL && this.kmPrL <= 50) {
            return 330;
        }
        else {
            System.out.println("Not valid KmPrL");
            return -1;
        }

    }


    @Override
    public String toString() {
        return "ElCar{" +
                "regNo=" + regNo +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", amountDoors=" + amountDoors +
                ", batteryCapacityKWh=" + batteryCapacityKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
