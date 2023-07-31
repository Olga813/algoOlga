package com.getjavajob.training.balakinao.init.algo.lesson01;

import java.util.Scanner;

public class Solution07 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input number A: ");
            int inputNumberA = scanner.nextInt();
            System.out.print("Input number B: ");
            int inputNumberB = scanner.nextInt();
            System.out.println("Swapped A with B method number 1 (bit by bit): " + swapBitByBitWay1(inputNumberA,
                inputNumberB));
            System.out.println("Swapped A with B method number 2 (bit by bit): " + swapBitByBitWay2(inputNumberA,
                inputNumberB));
            System.out.println("Swapped A with B method number 1 (arithmetic): " + swapNumbersWay1(inputNumberA,
                inputNumberB));
            System.out.println("Swapped A with B method number 2 (arithmetic): " + swapNumbersWay2(inputNumberA,
                inputNumberB));
            System.out.println((int)(char)(byte)-1);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static String swapBitByBitWay1(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return "NumberA:" + a + " NumberB:" + b;
    }

    public static String swapBitByBitWay2(int a, int b) {
        a = ~(a ^ b);
        b = ~(a ^ b);
        a = ~(a ^ b);
        return "NumberA:" + a + " NumberB:" + b;
    }

    public static String swapNumbersWay1(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        return "NumberA:" + a + " NumberB:" + b;
    }

    public static String swapNumbersWay2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return "NumberA:" + a + " NumberB:" + b;
    }

}