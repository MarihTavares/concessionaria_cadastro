package main;

import main.models.Car;
import main.models.Client;
import main.models.Motorcycle;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.setBrand("Toyota");
        car.setModel("Corolla Altis");
        car.setYear(2023);
        car.setPrice(175000.00);
        car.setFuel("Flex");

        car.showSheet();

        Motorcycle moto = new Motorcycle();

        moto.setBrand("Honda");
        moto.setModel("CB 650R");
        moto.setYear(2023);
        moto.setPrice(53000.00);
        moto.setEngineCapacity(95.2);

        moto.showSheet();

        Client client1 = new Client();

        client1.setName("Marina Araujo");
        client1.setCpf("45895405843");

        client1.personalFile();

        System.out.println("Reservando o Corolla...");
        car.book();

        car.showSheet();

        System.out.println("Tirando a reserva...");
        car.release();

        car.showSheet();

    }
}
