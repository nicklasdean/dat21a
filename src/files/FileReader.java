package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        ArrayList<Country> allCountries = new ArrayList<Country>();
        File populationFile = new File("resources/countries-population.csv");
        try {
            Scanner sc = new Scanner(populationFile);
            while(sc.hasNextLine()){
                //Få mappet dataværdier til et objekt
                String line = sc.nextLine();
                String[] stringAsArray = line.split(";");
                int countryId = Integer.parseInt(stringAsArray[0]);
                String country = stringAsArray[1];
                int population = Integer.parseInt(stringAsArray[2]);
                Country currentCountry = new Country(countryId,country,population);
                allCountries.add(currentCountry);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found");
            e.printStackTrace();
        }

        System.out.println(allCountries.size());
        System.out.println(allCountries.get(0).getCountry());

    }
}
