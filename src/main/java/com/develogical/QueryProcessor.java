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
    }

    public String process(String query) {
        String input = query.toLowerCase();
        String k = "";
        for(String key : map.keySet()) {
            if (input.contains(key)) {
                k = key;
            }
        }
        return(map.getOrDefault(k, ""));
    }
}
