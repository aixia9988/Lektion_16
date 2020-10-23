public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.model = "Volvo";
        car1.price = 100_000;
        car1.year = 2005;

        car2.model = "Saab";
        car2.price = 50_000;
        car2.year = 2001;

        System.out.printf("%s: årsmodell %d, %,d kr \n", car1.model, car1.year, car1.price);
        System.out.printf("%s: årsmodell %d, %,d kr \n", car2.model, car2.year, car2.price);

    }

    static class Car {
        int year;
        String model;
        int price;
    }
}


