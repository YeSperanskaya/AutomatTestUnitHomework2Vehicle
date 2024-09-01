package seminars.second.hw;

import org.junit.jupiter.api.Test;


import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


class VehicleTest{
    public static void main(String[] args) {

    }
    @Test
    void carInstanceOfVehicle() {
        Car car = new Car("Lada", "priora", 2023);
        assertThat(car, instanceOf(Vehicle.class));
    }
    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Lada", "priora", 2023);
        assertThat(car.getNumWheels(), equalTo(4));
    }
    @Test
    public void testMotorcycleHasTworWheels() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja 10R", 2023);
        assertThat(motorcycle.getNumWheels(), equalTo(2));
    }
    @Test
    public void testDriveCarIs60() {
        Car car = new Car("Lada", "priora", 2023);
        car.testDrive();
        assertThat(car.getSpeed(), equalTo(60));
    }

    @Test
    public void testDriveMotorcycleIs75() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja 10R", 2023);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed(), equalTo(75));
    }

    @Test
    public void testParkCar() {
        Car car = new Car("Lada", "priora", 2023);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed(), equalTo(0));
    }

    @Test
    public void testParkMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja 10R", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed(), equalTo(0));
    }


}