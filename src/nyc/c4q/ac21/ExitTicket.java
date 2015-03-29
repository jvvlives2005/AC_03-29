package nyc.c4q.ac21;
import java.util.HashMap;

/**
 * Created by c4q-joshelynvivas on 3/29/15.
 */
public class ExitTicket {
    public static void main(String[] args) {
        HashMap<Integer, String>  movieTheatres = new HashMap<Integer, String>();

        movieTheatres.put(1, "Raiders of the Lost Ark");
        movieTheatres.put(2, "To Have or Have Not");
        movieTheatres.put(3, "2001: A Space Odessey");
        movieTheatres.put(4, "Moonrise Kingdom");

        System.out.println(movieTheatres.get(3) + "is playing in which theatre?");

    }

}
