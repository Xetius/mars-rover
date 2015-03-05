package com.xetius.rover.reader;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class InstructionsReaderTest {

    public static final String FILENAME = "example.txt";
    private InstructionsReader reader;

    @Before
    public void setUp() throws Exception {
        reader = new InstructionsReader(FILENAME);
    }

    @Test
    public void openReturnsTrueWhenSuccess() throws Exception {
        final boolean result = reader.open();
        assertThat(result, equalTo(true));
    }
}