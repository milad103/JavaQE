package mentoring4;

import java.util.ArrayList;
import java.util.HashMap;

public class PracticingHashMap {

    public static void main(String[] args) {


        String[] carModel = {"Lincoln MKT", "Mercedes Class C", "BMW 5 series"};

        ArrayList<String> plateNumber = new ArrayList<String>();
        plateNumber.add("NYC-405411");
        plateNumber.add("MA-2015481");
        plateNumber.add("RI-855411");


        HashMap<String, String> carModelAndPlate = new HashMap<>();
        carModelAndPlate.put("Lincoln MKT", "NYC-405411");
        carModelAndPlate.put("Mercedes Class C", "MA-2015481");
        carModelAndPlate.put("BMW 5 series", "RI-855411");

        System.out.println(carModelAndPlate);

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
// to print out keysets only
        for (String luxuryCars:carModelAndPlate.keySet()) {
            System.out.println(luxuryCars);

        }
        // to print out values only
        for (String luxuryCars:carModelAndPlate.values()) {
            System.out.println(luxuryCars);
        }
    }
}