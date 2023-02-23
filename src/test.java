import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class test {
    public static void main(String[] args) {
        Song.howMany(new ArrayList<String>(Arrays.asList("Jonathan", "Sylvia", "Rena", "Teri", "Ann Ling")));
        Song.howMany(new ArrayList<String>(Arrays.asList("JoNathan", "Renita", "Amanda")));
        Song.howMany(new ArrayList<String>(Arrays.asList("AmAnda", "RENITA", "AmandA", "Athan")));
    }
}