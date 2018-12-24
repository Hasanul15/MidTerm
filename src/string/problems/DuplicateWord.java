package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

                String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

                String[] separateWords = str.split(" ");

                Map<String,Integer> Map = new HashMap<>();

                for ( String word : separateWords ) {
                    Integer count = Map.get(word);
                    if (count == null) {
                        count = 0;
                    }
                    Map.put(word, count + 1);
                }
                for(Map.Entry<String, Integer> strEntry : Map.entrySet()){
                    System.out.println("word '"+ strEntry.getKey() + "'" + ": " + strEntry.getValue() + " time(s)");
                }
            }

        }




