package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // TODO complete this main program
    // 1. create a WordCounter instance
    Map<String, Integer> theMap = Map.of();
    WordCounter counter = new WordCounter(theMap);
    // 2. use this to count the words in the input
    ArrayList<String> total = new ArrayList<>(counter.size());
    while (input.hasNext()) {
      total.add(input.next());
    }
    Iterator<String> iter1 = total.iterator();
    counter.countWords(iter1);
    // 3. determine the size of the resulting map
    int size = counter.size();
    // 4. create an ArrayList of that size and
    ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(size);
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    Iterator<Map.Entry<String, Integer>> iter = counter.getCounts().entrySet().iterator();
    while (iter.hasNext()) {
      list.add(iter.next());
    }
    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the
    //    latter)
    Collections.sort(list, new DescendingByCount());
    // 7. print the (up to) ten most frequent words in the text
    int num = 10;
    if (list.size() < 10) {
      num = list.size();
    }
    for (int i = 0; i < num; i++) {
      System.out.print(list.get(i).getKey());
      System.out.print(" = ");
      System.out.println(list.get(i).getValue());
    }
  }
}
