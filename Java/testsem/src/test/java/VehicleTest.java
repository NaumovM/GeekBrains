import static org.junit.Assert.*;
import org.junit.Test;
import sem2hw.*;


public class VehicleTest {

    @Test
    public void testCarInstance() {
        Vehicle car = new Car("Company", "Model", 2022, 4, 0);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarNumWheels() {
        Vehicle car = new Car("Company", "Model", 2022, 4, 0);
        assertEquals(4, Car.getNumWheels());
    }

    @Test
    public void testMotorcycleNumWheels() {
        Vehicle motorcycle = new Motorcycle("Company", "Model", 2022, 2, 0);
        assertEquals(2, Motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedDuringTestDrive() {
        Vehicle car = new Car("Company", "Model", 2022, 4, 0);
        car.testDrive();
        assertEquals(60, Car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedDuringTestDrive() {
        Vehicle motorcycle = new Motorcycle("Company", "Model", 2022, 2, 0);
        motorcycle.testDrive();
        assertEquals(75, Motorcycle.getSpeed());
    }

    @Test
    public void testCarStopWhileParking() {
        Vehicle car = new Car("Company", "Model", 2022, 4, 0);
        car.testDrive();
        car.park();
        assertEquals(0, Car.getSpeed());
    }

    @Test
    public void testMotorcycleStopWhileParking() {
        Vehicle motorcycle = new Motorcycle("Company", "Model", 2022, 2, 0);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, Motorcycle.getSpeed());
    }
}