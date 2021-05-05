package carTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import car.*;

public class TaxiMeterTest {
    @Test
    public void taxiMeterTest(){
        Car mini = new Mini();
        Car sedan = new Sedan();
        Car suv = new SUV();

        assertEquals(216,mini.calculateTotalFare(20));
        assertEquals(860,sedan.calculateTotalFare(80));
        assertEquals(1525,suv.calculateTotalFare(120));
    }
}
