package nyc.c4q.ac21;

import java.util.HashMap;
import java.util.Scanner;

public class MoonsAndPlanets {

    public static HashMap<String, Integer> getNumberofMoons(){
        HashMap<String, Integer> numberofMoons = new HashMap<String, Integer>();
        numberofMoons.put("mercury", 0);
        numberofMoons.put("venus", 0);
        numberofMoons.put("earth", 1);
        numberofMoons.put("mars", 2);
        numberofMoons.put("jupiter", 67);
        numberofMoons.put("saturn", 62);
        numberofMoons.put("uranus", 27);
        numberofMoons.put("neptune", 14);
        //System.out.println(numberofMoons);
        return numberofMoons;
    }

    public static int getNumberofMoons(String planet){
        HashMap<String, Integer> numberofMoons = getNumberofMoons();
        Integer num = numberofMoons.get(planet);
        if (num == null){
            return -1;
        }
        return num;
    }

    public static boolean isPlanet(String planet){
        HashMap<String, Integer> numberofMoons = getNumberofMoons();
        return (numberofMoons.containsKey(planet));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String planetSearch;
        HashMap<String, Integer> numberofMoons = getNumberofMoons();
        System.out.println("Search for number of moons for a given planet");
        planetSearch = scanner.next().toLowerCase();
        System.out.println(isPlanet(planetSearch));
        System.out.println(getNumberofMoons(planetSearch));
    }
}



