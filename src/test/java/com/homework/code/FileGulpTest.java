package com.homework.code;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by abhakthan on 1/13/2016.
 */
public class FileGulpTest {

    @Test
    public void testGetLine() throws Exception {
        FileGulp fg = new FileGulp("src/test/sample-text_1.txt");
        Assert.assertEquals("PERSON Bob Jones", fg.getLine());
    }

    @Test
    public void testHasNext() throws Exception {
        FileGulp fg = new FileGulp("src/test/sample-text_1.txt");
        Assert.assertEquals(true, fg.hasNext());
    }

    @Test
    public void testCount() throws Exception {
        FileGulp fg = new FileGulp("src/test/sample-text_1.txt");
        Assert.assertEquals(10, fg.count());
    }
}