package carTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.TaxiMeter;

public class TaxiMeterTest {

    @Test
    public void taxiMeterTest(){

        String outputString;

        outputString = TaxiMeter.setDistanceAndPhoneNumber(10, "9800098000");
        assertEquals("Mini - Rs. 90.0, Sedan - Rs. 105.0, SUV - Rs. 131.25",outputString);

        outputString = TaxiMeter.setDistanceAndPhoneNumber(20, "9800098000");
        assertEquals("Mini - Rs. 216.0, Sedan - Rs. 260.0, SUV - Rs. 325.0",outputString);

        outputString = TaxiMeter.setDistanceAndPhoneNumber(80, "9800098000");
        assertEquals("Mini - Rs. 576.0, Sedan - Rs. 774.0, SUV - Rs. 940.5",outputString);
    }
}
