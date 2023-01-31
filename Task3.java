package homework3;

import org.example.Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;

public class Task3 {
    public static void main(String[] args){
    getPlanetDelRepeats();
    }
    public static void getPlanetDelRepeats() {
        ArrayList<String> planets = new ArrayList<>();
        HashMap<String, Integer> planetCount = new HashMap<>();
        Random rand = new Random();

        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        for (int i = 0; i < 16; i++) {
            int randIndex = rand.nextInt(solarSystemPlanets.length);
            planets.add(solarSystemPlanets[randIndex]);
        }

        planets.sort(Comparator.naturalOrder());
        System.out.println(planets);


        for (String planet : planets) {
            if (planetCount.containsKey(planet)) {
                planetCount.put(planet, planetCount.get(planet) + 1);
            } else {
                planetCount.put(planet, 1);
            }
        }

        for (String planet : planetCount.keySet()) {
            System.out.printf("%s\t%s%n", planet, planetCount.get(planet));
        }

    }
}




