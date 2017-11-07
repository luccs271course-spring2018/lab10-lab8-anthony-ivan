package edu.luc.cs271.wordcount;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/** A map-based class for counting word frequencies from an iterator. */
public class WordCounter {

  /** The map for storing the word counts. */
  private final Map<String, Integer> theMap;
  private int size;
  
  public int size()
  {
    return size;
  }

  /** Creates a word counter instance based on the given map. */
  public WordCounter(final Map<String, Integer> theMap) {

  }

  /** Counts the frequencies of all words in the given iterator. */
  public void countWords(final Iterator<String> words) {

    // TODO for each word in the iterator, update the corresponding frequency in the map
    // HINT to do this without a conditional, use the getOrDefault method
   String token; 
    while (words.hasNext()){
      token = words.next();
     int result = theMap.getOrDefault(token,size++);
      
      
      
     
    }

  }

  /** Retrieve the frequency of a particular word. */
  public int getCount(final String word) {

    int result = Integer.parseInt(word); 
    return result;

  }

  /** Retrieve the map representing all word frequencies. */
  public Map<String, Integer> getCounts() {
    return Collections.unmodifiableMap(theMap);
  }
}
