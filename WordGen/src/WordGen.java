package Revision.WordGen.src;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordGen {

    public static void main(String[] args) throws Exception {

        // This is where I will make my word distribution detector.
        WordDistribution dist = new WordDistribution();

        // Opening and reading a simple text file
        // Since it's a simple text file, just use FileReader/BufferedReader

        FileReader in = new FileReader("C:\\Users\\orbis\\SDF\\Revision\\WordGen\\text\\cat_in_the_hat.txt");
        BufferedReader br = new BufferedReader(in);

        String line;

        // This prevents you from calling the br.readline command twice. :3
        while ((line = br.readLine()) != null) {
            // Remove all blank lines and punct
            line = line.trim().replaceAll("[^a-zA-Z0-9 ]", "");
            // if (line.length() <= 0) // This line is commented out; you may remove it if not needed
            // Convert all to Lower Case
            line = line.toLowerCase();
            // Splitting the words
            String[] words = line.split(" ");
            System.out.printf("line: %s\n", line);

            // Iterate up to the second-to-last word to avoid "ArrayIndexOutOfBoundsException"
            for (int i = 0; i < words.length - 1; i++) {
                // cur and Next words
                String curr = words[i];
                String next = words[i + 1];
                System.out.printf("   :curr: %s, next: %s\n", curr, next);
                dist.addWord2(curr, next);
            }
        }
        //close the buffered reader and file reader.
        br.close();
        in.close();
        // This printf statement was originally outside the while loop, so I moved it here.
        System.out.printf("\n\n======= distributions =============\n");
        dist.dumpDistribution();
    } 
}
