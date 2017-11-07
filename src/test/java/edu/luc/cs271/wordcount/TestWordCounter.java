package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Map;

public class TestWordCounter {
private String testFixture;

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter

  @Before
  public void setUp() {
    // TODO create the SUT instance
    testFixture = new WordCounter();
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
    testFixture = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    assertEquals(0,testFixture.getCount().size());
   // fail();

  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    fail();

  }
}
