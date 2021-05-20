package com;

import java.util.Arrays;
import java.util.ArrayList;

public class TwelveDaysOfChristmasSong {

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

    public String concatSong() {
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

            if (i != presentsArray.size() - 1) {
                eachDaySongString = "On the " + daysArray.get(i) + " day of Christmas my true love gave to me: " + presents + "\n";
            } else {
                eachDaySongString = "On the " + daysArray.get(i) + " day of Christmas my true love gave to me: " + presents;
            }

            eachDaySongList.add(eachDaySongString);
        }

        return eachDaySongList;
    }

    public static void main(String[] args) {
        TwelveDaysOfChristmasSong twelveDaysOfChristmasSong = new TwelveDaysOfChristmasSong();
        String twelveDaysSongOutput = twelveDaysOfChristmasSong.concatSong();
        System.out.println(twelveDaysSongOutput);
    }
}
