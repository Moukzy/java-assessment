package com.qa.javaAssessment;

public class Assessment {

    // Given a string, return a string where
    // for every char in the original string,
    // there are three chars.

    // multChar("The") ==> "TTThhheee"
    // multChar("AAbb") ==> "AAAAAAbbbbbb"
    // multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

    public String multChar(String input) {
        String word = "";
        for (int i = 0; i < input.length(); i++) {
            word += input.substring(i, i + 1);
            word += input.substring(i, i + 1);
            word += input.substring(i, i + 1);
        }
        return word;
    }

    // Return the string (backwards) that is between the first and last appearance
    // of "bert"
    // in the given string, or return the empty string "" if there is not 2
    // occurances of "bert" - Ignore Case

    // getBert("bertclivebert") ==> "evilc"
    // getBert("xxbertfridgebertyy") ==> "egdirf"
    // getBert("xxBertfridgebERtyy") ==> "egdirf"
    // getBert("xxbertyy") ==> ""
    // getBert("xxbeRTyy") ==> ""

    public String getBert(String input) {
        input = input.toLowerCase();
        String wordreverse = "";
        String lookfor = "bert";
        int startStringPos = 0;
        int i;
        int count = 0;
        String innerText;
        try {
            for (i = 0; i < input.length(); i++) {
                if (input.substring(i, i + lookfor.length()).equals(lookfor)) {
                    if (count == 0) {
                        i = i + lookfor.length();
                        startStringPos = i;
                        count++;
                    } else {
                        innerText = input.substring(startStringPos, i);
                        for (i = innerText.length() - 1; i >= 0; i--) {
                            wordreverse = wordreverse + innerText.substring(i, i + 1);
                        }
                        break;
                    }
                }
            }
            return wordreverse;
        } catch (Exception e) {
            return "";
        }
    }


    // Given three ints, a b c, one of them is small, one is medium and one is
    // large. Return true if the three values are evenly spaced, so the
    // difference between small and medium is the same as the difference between
    // medium and large. Do not assume the ints will come to you in a reasonable
    // order.

    // evenlySpaced(2, 4, 6) ==> true
    // evenlySpaced(4, 6, 2) ==> true
    // evenlySpaced(4, 6, 3) ==> false
    // evenlySpaced(4, 60, 9) ==> false

    public boolean evenlySpaced(int a, int b, int c) {
        int small = 0;
        int medium = 0;
        int large = 0;
        if (a > b && a > c) {
            a = large;
            if (b > c) {
                b = medium;
                c = small;
            } else {
                c = medium;
                b = small;
            }

        }


        return false;
    }

    // Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
    // The string length will be at least n, and be odd when the length of the input is odd.

    // nMid("Hello", 3) ==> "Ho"
    // nMid("Chocolate", 3) ==> "Choate"
    // nMid("Chocolate", 1) ==> "Choclate"

    public String nMid(String input, int a) {
        String wordStart;
        String wordEnd;
        int length;
        int midpoint;

        length = input.length();
        midpoint = length / 2;
        System.out.println(length);
        System.out.println(midpoint);
        wordStart = input.substring(0, midpoint - a / 2);
        wordEnd = input.substring(midpoint + 1 + a / 2, length);


        return wordStart + wordEnd;
    }


    // Given a string, return the length of the largest "block" in the string.
    // A block is a run of adjacent chars that are the same.
    //
    // superBlock("hoopplla") ==> 2
    // superBlock("abbCCCddDDDeeEEE") ==> 3
    // superBlock("") ==> 0

    public int superBlock(String input) {



        return -1;

    }

    //given a string - return the number of times "am" appears in the String ignoring case -
    // BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
    //
    //amISearch("Am I in Amsterdam") ==> 1
    //amISearch("I am in Amsterdam am I?") ==> 2
    //amISearch("I have been in Amsterdam") ==> 0

    public int amISearch(String arg1) {


        return -1;

    }

    //given a number
    // if this number is divisible by 3 return "fizz"
    // if this number is divisible by 5 return "buzz"
    // if this number is divisible by both 3  and 5return "fizzbuzz"
    //
    //fizzBuzz(3) ==> "fizz"
    //fizzBuzz(10) ==> "buzz"
    //fizzBuzz(15) ==> "fizzbuzz"

    public String fizzBuzz(int arg1) {
        String value = "";
        if (arg1 % 3 == 0) {
            value += "fizz";
        }
        if (arg1 % 5 == 0) {
            value += "buzz";
        }

        return value;
    }


//Given a string split the string into the individual numbers present
//then add each digit of each number to get a final value for each number
// String example = "55 72 86"
//
// "55" will = the integer 10
// "72" will = the integer 9
// "86" will = the integer 14
//
// You then need to return the highest vale
//
//largest("55 72 86") ==> 14
//largest("15 72 80 164") ==> 11
//largest("555 72 86 45 10") ==> 15

    public int largest(String arg1) {
        return -1;
    }
}
