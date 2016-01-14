package com.homework.code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhakthan on 1/13/2016.
 */
public class FileGulp {

    private List<String> lines;
    private int currentPos;

    /**
     * Constructor takes the file name
     *
     * @param fileName
     */
    public FileGulp(String fileName) throws IOException {
        this.readLines(fileName);
    }

    /**
     * Returns the next line as string
     *
     * @return line
     */
    public String getLine() throws Exception {
        if (hasNext()) {
            String line = lines.get(currentPos);
            currentPos++;
            return line;
        }
        throw new Exception("No more lines to return");
    }

    /**
     * Check if the has next line to read
     *
     * @return true or false
     */
    public boolean hasNext() {
        return currentPos < count();
    }

    /**
     * Returns the total lines in a file
     *
     * @return total lines
     */
    public int count() {
        return lines.size();
    }

    /**
     * Read the file and store each line in an array
     *
     * @param fileName file to read
     * @throws IOException
     */
    private void readLines(String fileName) throws IOException {
        BufferedReader br = null;
        FileReader fr = null;

        try {
            File f = new File(fileName);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            lines = new ArrayList<String>();
            String l;

            while ((l = br.readLine()) != null) {
                lines.add(l);
            }

        } catch (IOException ioe) {
            throw ioe;
        } finally {
            br.close();
            fr.close();
        }
    }
}
