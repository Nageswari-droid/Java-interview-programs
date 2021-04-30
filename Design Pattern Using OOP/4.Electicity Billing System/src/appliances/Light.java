package appliances;

import enumerator.ElectricAppliances;

public class Light implements ElectricAppliances{
	private int noOfComponents;
	private int perDayUse;
	
	public Light(int noOfComponents, int perDayUse) {
		this.noOfComponents = noOfComponents;
		this.perDayUse = perDayUse;
	}

	@Override
	public int calculateUnitForSingleDay() {
		return noOfComponents * perDayUse * Units.LIGHT.getValues();
	}

}
