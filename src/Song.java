import java.util.ArrayList;
import java.util.Objects;

public class Song {

    private final String title;
    private final String artist;

    public Song(String t, String a) {
        title = t;
        artist = a;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    private static final ArrayList<String> temp = new ArrayList<>();
    public static int howMany(ArrayList<String> arr) {
        int num = 0;
        for (String s : arr) {
            String name = s.toLowerCase();
            if (!temp.contains(name)) {
                temp.add(name);
                num++;
            }
        }
        return(num);
    }


}
