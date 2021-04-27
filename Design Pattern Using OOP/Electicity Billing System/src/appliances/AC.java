package appliances;

import enumerator.ElectricAppliances;

public class AC implements ElectricAppliances{
	
	private int noOfComponents;
	private int perDayUse;
	
	public AC(int noOfComponents, int perDayUse) {
		this.noOfComponents = noOfComponents;
		this.perDayUse = perDayUse;
	}

	@Override
	public int calculateUnitForSingleDay() {
		return noOfComponents* perDayUse * Units.AC.getValues();
	}
	
}
