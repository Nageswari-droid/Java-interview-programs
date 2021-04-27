package appliances;

import enumerator.ElectricAppliances;

public class Fridge implements ElectricAppliances{
	
	private int noOfComponents;
	private int perDayUse;
	
	public Fridge(int noOfComponents, int perDayUse) {
		this.noOfComponents = noOfComponents;
		this.perDayUse = perDayUse;
	}

	@Override
	public int calculateUnitForSingleDay() {
		return noOfComponents* perDayUse * Units.FRIDGE.getValues();
	}

}
