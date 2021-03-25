public class BenzineCar extends  Car{

    int octaneNo;
    int kmPrL;


    public BenzineCar(String regNo, String brand, String model, int year, int amountDoors,int octaneNo, int kmPrL) {

        super(regNo, brand, model, year, amountDoors);

        this.octaneNo = octaneNo;
        this.kmPrL = kmPrL;

    }


    @Override
    public double calcGreenFee()   {

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

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return '\n' +
                "BenzineCar " +
                "octaneNo = " + octaneNo +
                ", kmPrL = " + kmPrL +
                ", regNo = " + regNo +
                ", brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", amountDoors = " + amountDoors
                ;
    }
}
