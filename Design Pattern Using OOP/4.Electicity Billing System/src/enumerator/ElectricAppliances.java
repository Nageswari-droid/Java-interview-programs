package enumerator;

public interface ElectricAppliances {
	public enum Units{
		FAN(4), LIGHT(2), AC(10), FRIDGE(8);
		
		private int values;
		
		Units(int values) {
			this.values = values;
		}
		
		public int getValues() {
			return values;
		}
	}
	
	public int calculateUnitForSingleDay();
}
