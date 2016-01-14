package com.homework.code;

import java.util.LinkedHashSet;
import java.util.Map;

/**
 * Created by abhakthan on 1/13/2016.
 */
public class MasterData {

    Map<String, Integer> categoryMap;
    LinkedHashSet<String> rowString;

    /**
     * Constructor
     */
    public MasterData(Map<String, Integer> categoryMap, LinkedHashSet<String> rowString) {
        this.categoryMap = categoryMap;
        this.rowString = rowString;
    }

    /**
     * Getter for category count map
     *
     * @return
     */
    public Map<String, Integer> getCategoryMap() {
        return categoryMap;
    }

    /**
     * Getter for row string
     *
     * @return
     */
    public LinkedHashSet<String> getRowString() {
        return rowString;
    }
}
