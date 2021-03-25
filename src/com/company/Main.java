package com.company;

public class Main {

    public static String transfore (int num) {

        String str = String.valueOf(num);
        String result = str + " = ";
        int counter = 1;
        for (int i = str.length()-1; i >=0 ; i--) {
            char digit = str.charAt(i);

            result += "(" + digit + " * " + String.valueOf(counter) + ")" + " + ";
            counter *= 10;

        }
        result = result.substring(0,result.length()-3);
        return result;

    }

    public static void main(String[] args) {
        // 2234-> (1*1000) + (2*100) + (3*10) + (4+1) + 4
        System.out.println(transfore(1234));
    }
}
