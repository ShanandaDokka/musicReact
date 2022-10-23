import callAPIs.receiveSong;

import java.util.ArrayList;

public class mainRunner {
    private static receiveSong songGenerator = new receiveSong();

    public static void main(String[] args) {
        String question = "Where do you want to meet?";

        // ideally, call the smartReply API here to generate a response
        // but for now, we have manually generated one:
        // and also convert to all lower case

        String response = "wherever you are";
        printSongSuggestions(response);
    }

    public static void printSongSuggestions(String response) {
        System.out.println("reached");
        ArrayList<String[]> songSuggestions = songGenerator.getSong(response);
        for (String[] deets : songSuggestions) {
            System.out.println("Song Title: " + deets[0] + "; Song Author: " + deets[1]);
        }
    }

}
