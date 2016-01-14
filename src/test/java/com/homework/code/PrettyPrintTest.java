package com.homework.code;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by abhakthan on 1/13/2016.
 */
public class PrettyPrintTest {

    MasterData md;

    @Before
    public void setUp() throws Exception {
        FileGulp fg = new FileGulp("src/test/sample-text_1.txt");
        ProcessRow pr = new ProcessRow();

        while (fg.hasNext()) {
            pr.ingestLine(fg.getLine());
        }

        md = pr.getMaster();
    }

    @Test
    public void testPrintCategoryCounts() throws Exception {
        Assert.assertNotNull(md.getCategoryMap());
    }

    @Test
    public void testPrintFileInputData() throws Exception {
        Assert.assertNotNull(md.getRowString());
    }
}