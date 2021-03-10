package com.company;

public class Solution {
    private Numeral[] numerals = {
            new Numeral("M", 1000),
            new Numeral("CM", 900),
            new Numeral("D", 500),
            new Numeral("CD", 400),
            new Numeral("C", 100),
            new Numeral("XC", 90),
            new Numeral("L", 50),
            new Numeral("XL", 40),
            new Numeral("X", 10),
            new Numeral("IX", 9),
            new Numeral("V", 5),
            new Numeral("IV", 4),
            new Numeral("I", 1)
    };

    public String intToRoman(int num) {
        String output = "";
        for (Numeral numeral : numerals) {
            int numberRepeat = num / numeral.value;
            if (numberRepeat != 0) {
                output += numeral.symbol.repeat(numberRepeat);
                num %= numeral.value;
            }
        }
        return output;

    }

    class Numeral {
        String symbol;
        int value;

        public Numeral(String symbol, int value) {
            this.symbol = symbol;
            this.value = value;
        }
    }
}


