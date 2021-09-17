package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isAbecedarian("accdel"));
    }

    // takes a string and returns a boolean indicating whether the word is abecedarian
    static Boolean isAbecedarian (String x) { //takes a String


        int l = x.length()-1;           // definerer længden på teksten
        int diff;                       // differencen mellem to bogstaver

        int i = 0;                                  // tæller for næste bogstav i rækken
        String first = x.substring(i, i + 1);       //vælger første bogstav
        String second = x.substring(i + 1, i + 2);  //vælger andet bogstav



        //når andet bogstav er størrer end første bogstav og der er flere bogstaver at teste på
       for (diff = second.compareTo(first); diff > 0 && l > 0; i++) {
            l--;                                                        // tæller resten af bogstaverne
           first = x.substring(i, i + 1);
           second = x.substring(i + 1, i + 2);
       //    System.out.print(first);
       //    System.out.print(second);
           diff = second.compareTo(first);
       //    System.out.println(diff);
       }
       if (diff > 0){       //definere return med enten true eller false
           return true;
       }else {
           return false;
       }
    }




}
