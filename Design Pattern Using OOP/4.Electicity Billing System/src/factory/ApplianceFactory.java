package factory;

import enumerator.ElectricAppliances;
import appliances.Fan;
import appliances.Light;
import appliances.AC;
import appliances.Fridge;

public class ApplianceFactory {
	public static ElectricAppliances getInstance(String appliance, int noOfComponents, int perDayUse) {
		switch(appliance.toLowerCase()) {
		case "fan":
			return new Fan(noOfComponents, perDayUse);
		case "light":
			return new Light(noOfComponents, perDayUse);
		case "ac":
			return new AC(noOfComponents, perDayUse);
		case "fridge":
			return new Fridge(noOfComponents, perDayUse);
		default:
			return new ElectricAppliances() {
				@Override
                public int calculateUnitForSingleDay() {
                    // TODO Auto-generated method stub
                    return noOfComponents*perDayUse;
                }
			};
		}
	}
}
