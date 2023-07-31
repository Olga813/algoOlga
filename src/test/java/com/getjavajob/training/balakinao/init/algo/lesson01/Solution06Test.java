package com.getjavajob.training.balakinao.init.algo.lesson01;

import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution06.calculationPowerOfTwo;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution06.addTwoPowerOfTwo;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution06.add;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution06.convertingNumberBits;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution06.resetLowerBits;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution06.returnLowerBit;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution06.returnNBit;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution06.setBitOne;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution06.invertBit;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution06.setBitZero;

import static test.Assert.assertEquals;

public class Solution06Test {

    public static void main(String[] args) {
        testCalculationPowerOfTwo();
        testAddTwoPowerOfTwo();
        testAdd();
        testResetLowerBits();
        testSetBitOne();
        testInvertBit();
        testSetBitZero();
        testReturnLowerBit();
        testReturnNBit();
        testConvertingNumberBits();
    }

    public static void testCalculationPowerOfTwo() {
        assertEquals("lesson01.Solution06Test.calculationPowerOfTwo",0b100 , calculationPowerOfTwo(0b10));
    }

    public static void testAddTwoPowerOfTwo() {
        assertEquals("lesson01.Solution06Test.addTwoPowerOfTwo",0b1100 , addTwoPowerOfTwo(0b11,0b10));
    }

    public static void testAdd() {
        assertEquals("lesson01.Solution06Test.add",0b111 , add(0b10,0b101));
    }

    public static void testResetLowerBits() {
        assertEquals("lesson01.Solution06Test.resetLowerBits",0b10100 , resetLowerBits(0b10100,0b10));
    }

    public static void testSetBitOne() {
        assertEquals("lesson01.Solution06Test.setBitOne",0b10100 ,setBitOne(0b10100,0b10));
    }

    public static void testInvertBit() {
        assertEquals("lesson01.Solution06Test.invertBit",0b10000 ,invertBit(0b10100,0b10));
    }

    public static void testSetBitZero() {
        assertEquals("lesson01.Solution06Test.setBitZero",0b10000 ,setBitZero(0b10100,0b10));
    }

    public static void testReturnLowerBit() {
        assertEquals("lesson01.Solution06Test.returnLowerBit",0b100 ,returnLowerBit(0b10100,0b10));
    }
    public static void testReturnNBit() {
        assertEquals("lesson01.Solution06Test.returnNBit",0, returnNBit(0b10100,0b10));
    }
    public static void testConvertingNumberBits() {
        assertEquals("lesson01.Solution06Test.convertingNumberBits","0b10100" ,convertingNumberBits(0b10100));
    }

}