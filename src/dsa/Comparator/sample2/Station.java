package dsa.Comparator.sample2;



public class Station {

	String station_name;
	double temperature;
	double ph_value;
	double chloride;
	double flouride;

	public Station(String station_name, double temperature, double ph_value, double chloride, double flouride) {
		super();
		this.station_name = station_name;
		this.temperature = temperature;
		this.ph_value = ph_value;
		this.chloride = chloride;
		this.flouride = flouride;
	}

	@Override
	public String toString() {
		return "[station_name : " + station_name + "	| temperature : " + temperature + "		| ph : " + ph_value
				+ "		| chloride : " + chloride + "	| flouride : " + flouride + "]";
	}

}
