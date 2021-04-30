package appliances;

import enumerator.ElectricAppliances;

public class Fan implements ElectricAppliances {
	
	private int noOfComponents;
	private int perDayUse;
	
	public Fan(int noOfComponents, int perDayUse) {
		this.noOfComponents = noOfComponents;
		this.perDayUse = perDayUse;
	}

	@Override
	public int calculateUnitForSingleDay() {
		return noOfComponents* perDayUse * Units.FAN.getValues();
	}

}
