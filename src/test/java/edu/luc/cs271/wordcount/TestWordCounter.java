package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.*;
import java.util.Iterator;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  private WordCounter fixture;
  private Map<String, Integer> theMap = Map.of();

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
    assertEquals(0, fixture.getCount("word"));
    // fail();
  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    Iterator<String> iter = Arrays.asList("word", "word", "hello", "yes").iterator();
    fixture.countWords(iter);
    assertEquals(2, fixture.getCount("word"));
    assertEquals(1, fixture.getCount("hello"));
    assertEquals(0, fixture.getCount("happy"));
    assertEquals(0, fixture.getCount("sad"));
    // fail();

  }
}
