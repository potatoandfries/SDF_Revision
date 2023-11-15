package Revision.WordGen.src;

import java.util.HashMap;
import java.util.Map;

public class WordDistribution {

   //nested Map Structure
    private final Map<String, Map<String, Double>> dist = new HashMap<>();

    public void addWord(String root, String next) {
        // Check if we have encountered root
        if (!dist.containsKey(root)) {
            // Create the count map
            Map<String, Double> probMap = new HashMap<>();
            // add next, set probability to 1
            probMap.put(next, 1.0);
            dist.put(root, probMap);
            return;
        }

        // Implicit else
        // We have encountered the root word
        Map<String, Double> probMap = dist.get(root);
        if (!probMap.containsKey(next)) {
            probMap.put(next, 1.0);
        } else {
            Double count = probMap.get(next);
            count += 1.0;
            probMap.put(next, count);
        }
        return;
    }

    public void dumpDistribution() {
        for (String root : dist.keySet()) {
            System.out.printf("%s\n", root);
            Map<String, Double> probMap = dist.get(root);

            // Calculate the total count of all next words
            double totalCount = probMap.values().stream().mapToDouble(Double::doubleValue).sum();

            for (String next : probMap.keySet()) {
                // Calculate the probability by dividing the frequency by the total count
                double probability = probMap.get(next) / totalCount;
                System.out.printf("\t%s: %f\n", next, probability);
            }
        }
    }
}
