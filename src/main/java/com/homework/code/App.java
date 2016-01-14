package com.homework.code;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String filename;

        if (args.length > 0) {
            filename = args[0];
        } else {
            filename = "src/test/sample-text_2.txt";
        }

        System.out.println();
        System.out.println("Using file : " + filename);
        System.out.println();

        try {
            FileGulp fg = new FileGulp(filename);

            ProcessRow pr = new ProcessRow();

            while (fg.hasNext()) {
                pr.ingestLine(fg.getLine());
            }

            MasterData md = pr.getMaster();

            PrettyPrint.printCategoryCounts(md);

            System.out.println();

            PrettyPrint.printFileInputData(md);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
