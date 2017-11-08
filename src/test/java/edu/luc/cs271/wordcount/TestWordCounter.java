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
  private WordCounter fixture;
  private Map<String, Integer> theMap = Map.of("word", 3, "name", 4, "world", 0);
  
  @Before
  public void setUp() {
    // TODO create the SUT instance
    fixture = new WordCounter(theMap);
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {
    // TODO verify that the SUT initially returns an empty map
    assertEquals(0,fixture.getCount("word"));
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
