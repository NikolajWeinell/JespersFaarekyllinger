public class DieselCar extends Car {


    boolean hasParticlefilter;
    int kmPrL;


    public DieselCar(String regNo, String brand, String model, int year, int amountDoors, boolean hasParticlefilter,
                     int kmPrL) {

        super(regNo, brand, model, year, amountDoors);
        this.hasParticlefilter = hasParticlefilter;
        this.kmPrL = kmPrL;

    }

    @Override
    public double calcGreenFee() {

        if (kmPrL < 5) {
            return 10470 + 15260 + particleFilterFee();
        } else if (5 <= kmPrL && kmPrL < 10) {
            return 5500 + 2770 + particleFilterFee();
        } else if (10 <= kmPrL && kmPrL < 15) {
            return 2340 + 1850 + particleFilterFee();
        } else if (15 <= kmPrL && kmPrL < 20) {
            return 1050 + 1390 + particleFilterFee();
        } else if (20 <= kmPrL && kmPrL <= 50) {
            return 330 + 130 + particleFilterFee();
        } else {
            System.out.println("Not valid KmPrL");
            return -1;
        }
    }

    public int particleFilterFee() {
        if (!hasParticlefilter) {
            return 1000;
        }
        else return 0;
    }


    @Override
    public String toString() {
        return  '\n' +
                "DieselCar " +
                "regNo = " + regNo +
                ", brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", amountDoors = " + amountDoors +
                ", hasParticlefilter = " + hasParticlefilter +
                ", kmPrL = " + kmPrL
                ;
    }
}

