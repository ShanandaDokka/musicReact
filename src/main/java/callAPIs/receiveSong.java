package callAPIs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class receiveSong {
    private static final String filePath = "C:\\Users\\shana\\IdeaProjects\\musicReact\\src\\model\\miniData.json";

    // uncomment when smartReply works
//    private String text;
//
//    public receiveSong(String text) {
//        this.text = text;
//    }

    public ArrayList<String[]> getSong(String text) {
        //Creating a JSONParser object
        JSONParser jsonParser = new JSONParser();
        try {
            //Parsing the contents of the JSON file
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(filePath));
            String header = (String) jsonObject.get("header");
            JSONArray lang = (JSONArray) jsonObject.get("items");
            ArrayList<String[]> songSuggestions = new ArrayList<>();
            //Forming URL

            Iterator i = lang.iterator();

            // take each value from the json array separately
            while (i.hasNext()) {
                JSONObject innerObj = (JSONObject) i.next();
                String lyrics = (String) innerObj.get("lyrics");
                if (lyrics.contains(text)) {
                    String[] titleAndAuthor = new String[2];
                    titleAndAuthor[0] = (String) innerObj.get("title");
                    titleAndAuthor[1] = (String) innerObj.get("author");
                    songSuggestions.add(titleAndAuthor);
                }
            }
            return songSuggestions;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
