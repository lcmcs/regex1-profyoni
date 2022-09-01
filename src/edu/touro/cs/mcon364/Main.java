package edu.touro.cs.mcon364;

import java.util.*;

public class Main {

    public int add(int a, int b)
    {
        return a + b;
    }




    /**
     * @param text will only have alphabetical characters and spaces
     * @return the number of unique words (case insensitive)
     */
    public static int uniqueWordCount(String text)
    {
        Set<String> set = new HashSet<>();
        int counter = 0;
        Scanner sc = new Scanner(text);
        while (sc.hasNext())
        {
            String w = sc.next();
            set.add(w.toLowerCase());
        }
        return set.size();
    }

    class StringInt
    {
        public String key;
        public Integer value;
    }

    public static Map<String, Integer> wordFrequency(String text)
    {
        Map<String, Integer> freqMap = new HashMap<>();
        Scanner sc = new Scanner(text);
        while (sc.hasNext())
        {
            String w = sc.next().toLowerCase();

            if (! freqMap.containsKey(w))
                freqMap.put(w, 1);
            else
            {
                int val = freqMap.get(w);
                val++;
                freqMap.put(w, val);
            }
        }
        return freqMap;
    }
}
