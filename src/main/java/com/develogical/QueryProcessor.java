package com.develogical;

import java.util.HashMap;

public class QueryProcessor {

    private HashMap<String, String> map;

    public QueryProcessor() {
        map = new HashMap<>();
        map.put("shakespeare",
                "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                        "English poet, playwright, and actor, widely regarded as the greatest " +
                        "writer in the English language and the world's pre-eminent dramatist.");
        map.put("imperial",
                "Imperial College is a university in London");
        map.put("your name",
                "Beta");
        map.put("plus",
                "p");
    }

    public String process(String query) {
        String input = query.toLowerCase();
        String k = "";
        for(String key : map.keySet()) {
            if (input.contains(key)) {
                k = key;
            }
        }
        String output = map.getOrDefault(k, "");

        if (output.equals("p")) {
            int index = input.indexOf("plus");
            String first = input.substring(0, index - 1);
            String second = input.substring(index + 5);

            System.out.println(first + second);

            int iOfSpace = first.lastIndexOf(' ');
            String fstNum = first.substring(iOfSpace + 1);
            int a = Integer.parseInt(fstNum);
            int b = Integer.parseInt(second);

            return Integer.toString(a + b);

        }

        return(map.getOrDefault(k, ""));
    }
}
