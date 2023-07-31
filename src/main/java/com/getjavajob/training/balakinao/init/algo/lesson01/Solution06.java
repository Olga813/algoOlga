package com.getjavajob.training.balakinao.init.algo.lesson01;

import java.util.Scanner;

public class Solution06 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input number of bits (0<=n<31; TaskA and TaskB): ");
            int inputNumberN = scanner.nextInt();
            System.out.println("Calculation result 2 to the power: " + calculationPowerOfTwo(inputNumberN));
            System.out.print("Input number of bits (0<=m<31; TaskA and TaskB): ");
            int inputNumberM = scanner.nextInt();
            System.out.println("Calculation result 2^n+2^m: " + addTwoPowerOfTwo(inputNumberN, inputNumberM));
            System.out.print("Input number of bits (0<n<31): ");
            int inputNumberN2 = scanner.nextInt();
            System.out.print("Input number which bit to use (0<=n<8): ");
            int inputNumberBit = scanner.nextInt();
            System.out.println("After resetting the least significant bit: " + resetLowerBits(inputNumberN2,
                inputNumberBit));
            System.out.println("After set a's n-th bit with 1: " + setBitOne(inputNumberN2,
                inputNumberBit));
            System.out.println("After invert n-th bit: " + invertBit(inputNumberN2,
                inputNumberBit));
            System.out.println("Set a's n-th bit with 0: " + setBitZero(inputNumberN2,
                inputNumberBit));
            System.out.println("Return lower bit: " + returnLowerBit(inputNumberN2,
                inputNumberBit));
            System.out.println("Return n-th bit: " + returnNBit(inputNumberN2,
                inputNumberBit));
            System.out.println("After conversion from number to bits: " + convertingNumberBits(inputNumberN2));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    /**
     * Method calculation power Of two
     *
     * @param inputNumberN input int number 0<=N<31
     * @return int power Of two
     */
    public static int calculationPowerOfTwo(int inputNumberN) {
        return inputNumberN == 1 ? 1 : 0b10 << inputNumberN - 1;
    }

    /**
     * Method calculation 2^N+2^M
     *
     * @param inputNumberN input int number 0<=N<31
     * @param inputNumberM input int number 0<=M<31
     * @return int add two power Of two
     */
    public static int addTwoPowerOfTwo(int inputNumberN, int inputNumberM) {
        return add(calculationPowerOfTwo(inputNumberN), calculationPowerOfTwo(inputNumberM));
    }

    /**
     * Method calculation N+M
     *
     * @param summand1 input int number N
     * @param summand1 input int number M
     * @return int add two numbers
     */
    public static int add(int summand1, int summand2) {
        int transfer;
        while (summand2 != 0b0000) {
            transfer = summand1 & summand2;
            summand1 = summand1 ^ summand2;
            summand2 = transfer << 1;
        }
        return summand1;
    }

    /**
     * Method reset N lower bits
     *
     * @param inputNumberN2  input int number 0<N<31
     * @param inputNumberBit input int bit 0<=inputNumberBit<8
     * @return int reset low bit
     */
    public static int resetLowerBits(int inputNumberN2, int inputNumberBit) {
        return inputNumberN2 & (-1 << inputNumberBit);
    }

    /**
     * Method set a's N-th bit with 1
     *
     * @param inputNumberN2  input int number 0<N<31
     * @param inputNumberBit input int bit 0<=inputNumberBit<8
     * @return int set N-th bit with 1
     */
    public static int setBitOne(int inputNumberN2, int inputNumberBit) {
        return inputNumberN2 | (1 << inputNumberBit);
    }

    /**
     * Method invert bit
     *
     * @param inputNumberN2  input int number 0<N<31
     * @param inputNumberBit input int bit 0<=inputNumberBit<8
     * @return int invert bit
     */
    public static int invertBit(int inputNumberN2, int inputNumberBit) {
        return inputNumberN2 ^ (1 << inputNumberBit);
    }

    /**
     * Method set a's N-th bit with 0
     *
     * @param inputNumberN2  input int number 0<N<31
     * @param inputNumberBit input int bit 0<=inputNumberBit<8
     * @return int set N-th bit with 0
     */
    public static int setBitZero(int inputNumberN2, int inputNumberBit) {
        return inputNumberN2 & ~(1 << inputNumberBit);
    }

    /**
     * Method return n lower bits
     *
     * @param inputNumberN2  input int number 0<N<31
     * @param inputNumberBit input int bit 0<=inputNumberBit<8
     * @return int n lower bits
     */
    public static int returnLowerBit(int inputNumberN2, int inputNumberBit) {
        return inputNumberN2 & (1 << inputNumberBit);

    }

    /**
     * Method return n-th bits
     *
     * @param inputNumberN2  input int number 0<N<31
     * @param inputNumberBit input int bit 0<=inputNumberBit<8
     * @return int n-th bits
     */
    public static int returnNBit(int inputNumberN2, int inputNumberBit) {
        return inputNumberN2 & ~(~0 << inputNumberBit);

    }

    /**
     * Method converting a number to bits
     *
     * @param inputNumberN2 input int number 0<N<31
     * @return String converting a number to bits
     */
    public static String convertingNumberBits(int inputNumberN2) {
        String result = "";
        while (inputNumberN2 != 1) {
                        result = (inputNumberN2 & 1) + result;
            inputNumberN2 >>= 1;
        }
        return "0b" + 1 + result;
    }

}