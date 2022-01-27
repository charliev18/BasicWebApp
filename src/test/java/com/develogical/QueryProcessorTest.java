package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutImperial() throws Exception {
        assertThat(queryProcessor.process("Imperial"),
                containsString("university"));
    }

    @Test
    public void knowsAboutName() throws Exception {
        assertThat(queryProcessor.process("What is your name"),
                containsString("Beta"));
    }

    @Test
    public void knowsAddition() throws Exception {
        assertThat(queryProcessor.process("What is 2 plus 2"),
                containsString("4"));
    }

    @Test
    public void knowsMultiplication() throws Exception {
        assertThat(queryProcessor.process("What is 2 multiplied by 3"),
                containsString("6"));
    }

    @Test
    public void knowsLargeness() throws Exception {
        assertThat(queryProcessor.process("What is the largest: 2, 4, 6, 100"),
                containsString("100"));
    }

    @Test
    public void knowsLargeness2() throws Exception {
        assertThat(queryProcessor.process("What is the largest: 30, 1"),
                containsString("30"));
    }

    @Test
    public void knowsLargeness3() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 4"),
                containsString("4"));
    }

    @Test
    public void knowsPrimes() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the prime: 8, 9, 11"),
                containsString("11"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
}
