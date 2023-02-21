import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ClimateZone {
	private ArrayList<City> cityList;
	
	public ClimateZone() {
		this.cityList = new ArrayList<City>();
	}
	
	public ClimateZone(String fileName) throws IOException {
		this.cityList = new ArrayList<City>();
		FileInputStream inFS = new FileInputStream(fileName);
		Scanner scnr = new Scanner(inFS);
		
		String line = inFS.nextLine()
		String name = 
		String state = 
		double highTemp = 
		double lowTemp = 
	}
//	The overloaded constructor should instantiate a new ArrayList object, and store a reference to this object in the ClimateZone's cityList instance variable. It should then open the climate zone data file named in the parameter variable. It should then read in the data from this file and, for each line in the file, it should create (instantiate) a new City object with the name, state, high temp., and low temp. on that line, and add this City to the ArrayList cityList.
	public void addCity(String name, String state, double highTemp, double lowTemp) {
		
	}
	
	public int getCityCount() {
		return this.cityList.size();
	}
	
	public City getCityByName(String name, String state) {
		
	}

	public void printHottestCities() {
		
	}
	
	public void printColdestCities() {
		
	}
	
	public void printAllCities() {
		
	}

//	The addCity method should instantiate a new City object with the name, state, high temp., and low temp. provided in the argument values, and then add this City to the ClimateZone's ArrayList<City> object.
//	The getCityCount method should return the number of cities currently stored in the ClimateZone's ArrayList<City> object.
//	The getCityByName method should iterate through the ClimateZone's ArrayList<City> object and search for a City with a name and state that are equal to the argument values. If such a City is found, then this method should return a reference to that City object, otherwise this method should return null.
//	The printHottestCities method should determine the two Cities objects with the highest high temps. (in descending order). It should then call the printInfo method on these City objects.
//	The printColdestCities method should determine the two City objects with the lowest low temps. (in ascending order). It should then call the printInfo method on these City objects.
//	The printAllCities method should iterate through the ClimateZone's ArrayList<City> object and call the printInfo method on each of these City objects.
}