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
		FileInputStream zoneFile = new FileInputStream(fileName);
		Scanner inFS = new Scanner(zoneFile);

		while (inFS.hasNext()) {
			String line = inFS.nextLine();
			String name = line.substring(0, line.indexOf(" ")); 
			String state = line.substring(line.indexOf(" ") + 1, line.indexOf(" ", line.indexOf(" ") + 1));
			double highTemp = Double.parseDouble(line.substring(line.indexOf(" ", line.indexOf(" ") + 1), line.lastIndexOf(" ")));
			double lowTemp = Double.parseDouble(line.substring(line.lastIndexOf(" "), line.length()));
			City newCity = new City(name, state, highTemp, lowTemp);
			this.cityList.add(newCity);
		}

		inFS.close();
		zoneFile.close();
	}

	public void addCity(String name, String state, double highTemp, double lowTemp) {
		City newCity = new City(name, state, highTemp, lowTemp);
		this.cityList.add(newCity);
	}

	public int getCityCount() {
		return this.cityList.size();
	}

	public City getCityByName(String name, String state) {
		for (City currentCity : cityList) {
			if (currentCity.getName().equals(name) && currentCity.getState().equals(state)) {
				return currentCity;
			}
		}
		return null;
	}

	public void printHottestCities() {
		City firstHottest = cityList.get(0);
		City nextColdest = cityList.get(1);
		
		for (City currentCity : cityList) {
			if (currentCity.getHighTemp() > firstHottest.getHighTemp()) {
				firstHottest = currentCity;
			}
		}
		
		for (City currentCity : cityList) {
			if ((currentCity.getHighTemp() > nextColdest.getHighTemp()) && (currentCity != firstHottest)) {
				 nextColdest = currentCity;
			}
		}
		
		firstHottest.printInfo();
		nextColdest.printInfo();
	}

	public void printColdestCities() {
		City firstColdest = cityList.get(0);
		City nextColdest = cityList.get(1);
		
		for (City currentCity : cityList) {
			if (currentCity.getLowTemp() < firstColdest.getLowTemp()) {
				firstColdest = currentCity;
			}
		}
		
		for (City currentCity : cityList) {
			if ((currentCity.getLowTemp() < nextColdest.getLowTemp()) && (currentCity != firstColdest)) {
				 nextColdest = currentCity;
			}
		}
		
		firstColdest.printInfo();
		nextColdest.printInfo();
	}

	public void printAllCities() {
		for (City currentCity : cityList) {
			currentCity.printInfo();
		}
	}
}