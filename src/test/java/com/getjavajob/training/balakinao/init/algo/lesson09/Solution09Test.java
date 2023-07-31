package com.getjavajob.training.balakinao.init.algo.lesson09;

import java.nio.file.Path;
import java.util.TreeSet;

import static com.getjavajob.training.balakinao.init.algo.lesson09.Solution09.sortCity;
import static test.Assert.assertEquals;

public class Solution09Test {

    public static void main(String[] args) {
        testSortCity();
    }

    public static void testSortCity() {
        Path path = Path.of("src", "main",
            "java", "com", "getjavajob", "training", "balakinao", "init", "algo", "lesson09", "city.txt");
        TreeSet <String> cityExpected1 = new TreeSet <>();
        cityExpected1.add("Mogilev");
        cityExpected1.add("Mogilev\uFFFF");
        cityExpected1.add("MOSCOW");
        cityExpected1.add("Moscow\uFFFF");
        cityExpected1.add("Mo\uFFFFgilev ");
        cityExpected1.add("Mo\uFFFFgilev\uFFFF\uFFFF");
        cityExpected1.add("Mo\uFFFFscow");
        cityExpected1.add("Mo\uFFFF\uFFFFscow");
        cityExpected1.add("Mo\uFFFF\uFFFFscow\uFFFF\uFFFF");
        TreeSet <String> cityExpected2 = new TreeSet <>();
        cityExpected2.add("Mo\uFFFFgilev ");
        cityExpected2.add("Mo\uFFFFgilev\uFFFF\uFFFF");
        cityExpected2.add("Mo\uFFFFscow");
        cityExpected2.add("Mo\uFFFF\uFFFFscow");
        cityExpected2.add("Mo\uFFFF\uFFFFscow\uFFFF\uFFFF");


        TreeSet <String> cityExpected3 = new TreeSet <>();
        cityExpected3.add("￿");
        cityExpected3.add("\uFFFFMoCharacter");
        cityExpected3.add("￿￿");
        cityExpected3.add("￿￿Moooooogilev￿");
        cityExpected3.add("\uFFFF\uFFFFmoscow");

        assertEquals("lesson09.Solution09Test.testSortCity1", cityExpected1, sortCity("mo", path));
        assertEquals("lesson09.Solution09Test.testSortCity2", cityExpected2, sortCity("mo\uFFFF", path));
        assertEquals("lesson09.Solution09Test.testSortCity2", cityExpected3, sortCity("\uFFFF", path));
    }
}