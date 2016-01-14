package com.homework.code;

import java.util.LinkedHashSet;
import java.util.Map;

/**
 * Created by abhakthan on 1/13/2016.
 */
public class PrettyPrint {

    /**
     * Constructor
     */
    private PrettyPrint() {
    }

    /**
     * Print the category and its count
     *
     * @param md master dataset
     */
    public static void printCategoryCounts(MasterData md) {

        Map<String, Integer> map = md.getCategoryMap();

        System.out.println("Category \t Count");
        System.out.println("--------------------------------------");
        for (String k : Constants.categories) {
            if (map.containsKey(k)) {
                System.out.println(k + "\t" + map.get(k));
            } else {
                System.out.println(k + "\t0");
            }
        }
    }

    /**
     * Print the unique data set
     *
     * @param md unique data set
     */
    public static void printFileInputData(MasterData md) {
        LinkedHashSet<String> set = md.getRowString();

        for (Object k : set.toArray()) {
            System.out.println((String) k);
        }
    }
}
