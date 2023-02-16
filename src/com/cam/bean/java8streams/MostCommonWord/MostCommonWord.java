package com.cam.bean.java8streams.MostCommonWord;

import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
    public static void main(String[] args){
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedWordsSet = new HashSet<>();
        HashMap<String, Integer> validWordsMap = new HashMap<>();
        for(String str: banned){
            bannedWordsSet.add(str);
        }
        String []validWords =  paragraph.toLowerCase().split("\\W+");
        for(String str: validWords){
            if(!bannedWordsSet.contains(str)){
                validWordsMap.put(str, validWordsMap.getOrDefault(str, 0)+1);
                //System.out.println(str+" "+validWordsMap.getOrDefault(str, 0)+1);
            }
        }

        int max = 0;
        String result = "";
        for(String key:validWordsMap.keySet()){
            if(validWordsMap.get(key)>max){
                max = validWordsMap.get(key);
                result = key;
               //System.out.println("Max: "+max+" Result: "+result);
            }
        }
        return result;
    }
}
