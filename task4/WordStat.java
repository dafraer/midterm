package midterm.kamil_nuriev_1.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;
        //Add elements from fantasyFormatData to the set
        Set<String> mySet = new HashSet<>(fantasyFormatData);
        //Output the set to the console
        for (String element : mySet) {
            System.out.println(element);
        }
        //Create a file task4.txt
        try {
            // Create a FileWriter object to write to the file
            FileWriter writer = new FileWriter("./task4/task4.txt");

            // Write content to the file
            for (String element : mySet) {
                element += "\n";
                writer.write(element);
            }
            // Close the FileWriter
            writer.close();

        } catch (IOException e) {
            // Handle exceptions
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
        //Create the map in which the key will be the length of the word and the value will be the number of the words with the
        //corresponding length
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i < fantasyFormatData.size(); i++) {
            int wordLength = fantasyFormatData.get(i).length();

            // Update the map with the word length and its frequency
            myMap.put(wordLength, myMap.getOrDefault(wordLength, 0) + 1);
        }

        //Output the map to the console
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        //Add map to the file task4.txt
        try {
            // Create a FileWriter object to write to the file
            FileWriter writer = new FileWriter("./task4/task4.txt", true);

            // Write content to the file
            writer.write("\n\n");
            for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
                writer.write("Key: " + entry.getKey() + ", Value: " + entry.getValue() + "\n");
            }
            // Close the FileWriter
            writer.close();

        } catch (IOException e) {
            // Handle exceptions
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
