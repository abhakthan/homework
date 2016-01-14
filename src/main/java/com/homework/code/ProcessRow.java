package com.homework.code;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * Created by abhakthan on 1/13/2016.
 */
public class ProcessRow {

    Map<String, Integer> map = new HashMap<String, Integer>();
    LinkedHashSet<String> hls = new LinkedHashSet<String>();

    /**
     * Constructor
     */
    public ProcessRow() {
    }

    /**
     * Inget each line and process it
     *
     * @param line line
     */
    public void ingestLine(String line) {
        String category = getCategory(line);
        if (isInCategory(category)) {
            boolean added = hls.add(line);
            if (added && map.containsKey(category)) {
                Integer r = map.get(category);
                map.put(category, r + 1);
            } else if (added) {
                map.put(category, 1);
            }
        }
    }

    /**
     * Returns the master dataset
     *
     * @return master dataset
     */
    public MasterData getMaster() {
        return new MasterData(map, hls);
    }

    /**
     * Split the string in to two based on space delimiter and return the category
     *
     * @return string array
     */
    private String getCategory(String line) {
        return line.split(" ", 2)[0];
    }

    /**
     * Check if the input string matches the allowed category
     *
     * @param input
     * @return
     */
    private boolean isInCategory(String input) {
        boolean matchFound = false;
        for (String cat : Constants.categories) {
            if (cat.equalsIgnoreCase(input)) {
                matchFound = true;
            }
        }
        return matchFound;
    }
}
