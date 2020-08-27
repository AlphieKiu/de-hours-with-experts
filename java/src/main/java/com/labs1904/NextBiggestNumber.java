package com.labs1904;

public class NextBiggestNumber {

    public static void main(String[] args) {
        Integer input = Integer.parseInt(args[0]);
        Integer nextBiggestNumber = getNextBiggestNumber(input);
        System.out.println("Input: " + input);
        System.out.println("Next biggest number: " + nextBiggestNumber);
    }

    public static int getNextBiggestNumber(Integer i) {
       String temp = Integer.toString(i);

        int[] digitArr = new int[temp.length()];
        for (int j = 0; j < temp.length(); j++) {
            digitArr[j] = temp.charAt(j) - '0';
        };

        Arrays.sort(digitArr);
        int result = 0;

        for (int k = digitArr.length-1; k >= 0; k--) {
            result*= 10;
            result += digitArr[k];
        };

        if (result == i) {
            return -1;
        } else {
            return result;
        }
    }
}
