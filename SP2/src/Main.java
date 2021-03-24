public class Main {

    public static void main(String[] args) {


        Car bcar1 = new BenzineCar(135345345,"Audi","A3",2005,5,15, 5);
        Car dcar1 = new DieselCar(135345345,"Audi","A3",2005,5,false,15);
        Car dcar2 = new DieselCar(135345345,"Audi","A3",2005,5,true,15);
        Car ecar1 = new ElCar(135345345,"Audi","A3",2005,5,15,15,15,15);

        Garage garage1 = new Garage("JespersGarage");

        garage1.addCar(bcar1);
        garage1.addCar(dcar1);
        garage1.addCar(dcar2);
        garage1.addCar(ecar1);


        garage1.calcSumGreenFee();


    }
}
