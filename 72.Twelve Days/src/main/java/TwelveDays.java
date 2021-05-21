import java.util.ArrayList;
import java.util.Arrays;

class TwelveDays {
    private final ArrayList<String> daysArray = new ArrayList<>(Arrays.asList("first",
            "second",
            "third",
            "fourth",
            "fifth",
            "sixth",
            "seventh",
            "eighth",
            "ninth",
            "tenth",
            "eleventh",
            "twelfth"));
    private final ArrayList<String> presentsArray = new ArrayList<>(Arrays.asList("a Partridge in a Pear Tree.",
            "two Turtle Doves, ",
            "three French Hens, ",
            "four Calling Birds, ",
            "five Gold Rings, ",
            "six Geese-a-Laying, ",
            "seven Swans-a-Swimming, ",
            "eight Maids-a-Milking, ",
            "nine Ladies Dancing, ",
            "ten Lords-a-Leaping, ",
            "eleven Pipers Piping, ",
            "twelve Drummers Drumming, "));

    String verse(int verseNumber) {
        ArrayList<String> song = songMap();
        return song.get(verseNumber - 1);
    }

    String verses(int startVerse, int endVerse) {
        ArrayList<String> song = songMap();
        String concatVerses = "";

        for (int i = startVerse - 1; i < endVerse; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if (i != endVerse - 1) {
                concatVerses = stringBuilder.append(concatVerses).append(song.get(i)).append("\n").toString();
            } else {
                concatVerses = stringBuilder.append(concatVerses).append(song.get(i)).toString();
            }
        }

        return concatVerses;
    }

    public String sing() {
        ArrayList<String> song = songMap();
        String twelveDaysSong = "";

        for (int i = 0; i < song.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if (i != song.size() - 1) {
                twelveDaysSong = stringBuilder.append(twelveDaysSong).append(song.get(i)).append("\n").toString();
            } else {
                twelveDaysSong = stringBuilder.append(twelveDaysSong).append(song.get(i)).toString();
            }
        }
        return twelveDaysSong;
    }

    public ArrayList<String> songMap() {
        String presents = "";
        String eachDaySongString;

        ArrayList<String> eachDaySongList = new ArrayList<>();

        for (int i = 0; i < presentsArray.size(); i++) {
            String presentValue = presentsArray.get(i);

            if (daysArray.get(i).equals("second")) {
                presents = "and " + presents;
            }

            StringBuilder stringBuilder = new StringBuilder();
            presents = stringBuilder.append(presentValue).append(presents).toString();

            eachDaySongString = "On the " + daysArray.get(i) + " day of Christmas my true love gave to me: " + presents + "\n";

            eachDaySongList.add(eachDaySongString);
        }

        return eachDaySongList;
    }

    public static void main(String[] args) {
        TwelveDays twelveDays = new TwelveDays();
        String twelveDaysSongOutput = twelveDays.sing();
        System.out.println(twelveDaysSongOutput);
    }
}
