package com.homework.code;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by abhakthan on 1/13/2016.
 */
public class ProcessRowTest {

    FileGulp fg;

    @Before
    public void setUp() throws Exception {
        fg = new FileGulp("src/test/sample-text_1.txt");
    }

    @Test
    public void testGet() throws Exception {
        ProcessRow pr = new ProcessRow();

        while (fg.hasNext()) {
            pr.ingestLine(fg.getLine());
        }

        MasterData md = pr.getMaster();

        // assert count to 5
        Assert.assertEquals(5, md.getCategoryMap().size());

        // assert count to 8
        Assert.assertEquals(8, md.getRowString().size());

        // assert count to 2
        Assert.assertEquals(new Integer(2), md.getCategoryMap().get("PERSON"));

        // assert count to 2
        Assert.assertEquals(new Integer(2), md.getCategoryMap().get("PLACE"));

        // assert count to 2
        Assert.assertEquals(new Integer(2), md.getCategoryMap().get("ANIMAL"));

        // assert count to 1
        Assert.assertEquals(new Integer(1), md.getCategoryMap().get("COMPUTER"));

        // assert count to 1
        Assert.assertEquals(new Integer(1), md.getCategoryMap().get("OTHER"));

    }
}