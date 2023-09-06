package ru.job4j.oop;

public class Truck extends Vehicle {
    public Truck() { }

    public Truck(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void info() {
        System.out.println("Бренд: " + this.brand);
        System.out.println("Максимальная скорость: " + this.maxSpeed);
    }

    @Override
    public void accelerate() {
        System.out.println("Электронная педаль газа");
    }

    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление");
    }
}