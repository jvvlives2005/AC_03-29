package nyc.c4q.ac21;

import javax.swing.plaf.nimbus.State;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.*;

public class Capitals {

    /**
     * @return
     *   A map from names of U.S. states to names of their capitals.
     */
    public static HashMap<String, String> getCapitals() {
        HashMap<String, String> capitals = new HashMap<String, String>();
        capitals.put("Alabama", "Montgomery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Phoenix");
        capitals.put("Arkansas", "Little Rock");
        capitals.put("California", "Sacramento");
        capitals.put("Colorado", "Denver");
        capitals.put("Connecticut", "Hartford");
        capitals.put("Delaware", "Dover");
        capitals.put("Florida", "Tallahassee");
        capitals.put("Georgia", "Atlanta");
        capitals.put("Hawaii", "Honolulu");
        capitals.put("Idaho", "Boise");
        capitals.put("Illinois", "Springfield");
        capitals.put("Indiana", "Indianapolis");
        capitals.put("Iowa", "Des Moines");
        capitals.put("Kansas", "Topeka");
        capitals.put("Kentucky", "Frankfort");
        capitals.put("Louisiana", "Baton Rouge");
        capitals.put("Maine", "Augusta");
        capitals.put("Maryland", "Annapolis");
        capitals.put("Massachusetts", "Boston");
        capitals.put("Michigan", "Lansing");
        capitals.put("Minnesota", "Saint Paul");
        capitals.put("Mississippi", "Jackson");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Montana", "Helena");
        capitals.put("Nebraska", "Lincoln");
        capitals.put("Nevada", "Carson City");
        capitals.put("New Hampshire", "Concord");
        capitals.put("New Jersey", "Trenton");
        capitals.put("New Mexico", "Santa Fe");
        capitals.put("New York", "Albany");
        capitals.put("North Carolina", "Raleigh");
        capitals.put("North Dakota", "Bismarck");
        capitals.put("Ohio", "Columbus");
        capitals.put("Oklahoma", "Oklahoma City");
        capitals.put("Oregon", "Salem");
        capitals.put("Pennsylvania", "Harrisburg");
        capitals.put("Rhode Island", "Providence");
        capitals.put("South Carolina", "Columbia");
        capitals.put("South Dakota", "Pierre");
        capitals.put("Tennessee", "Nashville");
        capitals.put("Texas", "Austin");
        capitals.put("Utah", "Salt Lake City");
        capitals.put("Vermont", "Montpelier");
        capitals.put("Virginia", "Richmond");
        capitals.put("Washington", "Olympia");
        capitals.put("West Virginia", "Charleston");
        capitals.put("Wisconsin", "Madison");
        capitals.put("Wyoming", "Cheyenne");
        return capitals;
    }
    public static String getCapitals (String States){
        HashMap<String, String> capitals = getCapitals();
        String state = capitals.get(States);
        if (state == null) {
            System.out.println("ERROR");
        }
        return state;
    }
    public static boolean isCapital(String State){
        HashMap<String, String> capitals = getCapitals();
        return (capitals.containsKey(State));
    }
    public static void main(String[] args) {
        // Write a program that prompts the user for the name of a state.
        Scanner input = new Scanner(in);
        String inputstate;
        HashMap<String, String> capitals = getCapitals();

        System.out.println("Give me a State:");

        inputstate= input.nextLine();
        System.out.println(getCapitals(inputstate));



        // If the user enters the name of a state, print out,
        //   The capital of (state) is (capital).
        //
        // Otherwise, print out,
        //   (name) is not a state!

        // FIXME: Write this method.
    }
}
