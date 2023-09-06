package ru.job4j.oop;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", 200);
        truck.info();
        truck.accelerate();
        truck.steer();
        truck.brake();
    }
}
