package com.getjavajob.training.balakinao.init.algo;

import com.getjavajob.training.balakinao.init.algo.lesson01.Solution06Test;
import com.getjavajob.training.balakinao.init.algo.lesson01.Solution07Test;
import com.getjavajob.training.balakinao.init.algo.lesson03.DynamicArrayPerformanceTest;
import com.getjavajob.training.balakinao.init.algo.lesson03.ListIteratorTest;
import com.getjavajob.training.balakinao.init.algo.lesson03.Solution03Test;
import com.getjavajob.training.balakinao.init.algo.lesson04.DoublyLinkedListIteratorTest;
import com.getjavajob.training.balakinao.init.algo.lesson04.DoublyLinkedListPerformanceTest;
import com.getjavajob.training.balakinao.init.algo.lesson04.DynamicArrayListIteratorTest;
import com.getjavajob.training.balakinao.init.algo.lesson04.JdkListsPerformanceTest;
import com.getjavajob.training.balakinao.init.algo.lesson04.Solution04Test;
import com.getjavajob.training.balakinao.init.algo.lesson05.CollectionUtilsTest;
import com.getjavajob.training.balakinao.init.algo.lesson05.DequeTest;
import com.getjavajob.training.balakinao.init.algo.lesson05.QueueTest;
import com.getjavajob.training.balakinao.init.algo.lesson05.Solution05Test;
import com.getjavajob.training.balakinao.init.algo.lesson05.UnmodifiableCollectionTest;
import com.getjavajob.training.balakinao.init.algo.lesson06.AssociativeArrayPerformanceTest;
import com.getjavajob.training.balakinao.init.algo.lesson06.AssociativeArrayTest;
import com.getjavajob.training.balakinao.init.algo.lesson06.HashMapMatrixTest;
import com.getjavajob.training.balakinao.init.algo.lesson06.LinkedHashMapTest;
import com.getjavajob.training.balakinao.init.algo.lesson06.LinkedHashSetTest;
import com.getjavajob.training.balakinao.init.algo.lesson06.MapTest;
import com.getjavajob.training.balakinao.init.algo.lesson06.SetTest;
import com.getjavajob.training.balakinao.init.algo.lesson07.LinkedBinaryTreeTest;
import com.getjavajob.training.balakinao.init.algo.lesson08.BalanceableTreeTest;
import com.getjavajob.training.balakinao.init.algo.lesson08.BinarySearchTreeTest;
import com.getjavajob.training.balakinao.init.algo.lesson09.NavigableMapTest;
import com.getjavajob.training.balakinao.init.algo.lesson09.NavigableSetTest;
import com.getjavajob.training.balakinao.init.algo.lesson09.Solution09Test;
import com.getjavajob.training.balakinao.init.algo.lesson09.SortedMapTest;
import com.getjavajob.training.balakinao.init.algo.lesson09.SortedSetTest;
import com.getjavajob.training.balakinao.init.algo.lesson10.ArraysTest;
import com.getjavajob.training.balakinao.init.algo.lesson10.SortingTest;

import java.util.Date;

public class TestSuite {

    public static void main(String[] args) {
        System.out.println(new Date() + ": tests started...");
        System.out.println("--------");
        Solution06Test.main(args);
        Solution07Test.main(args);
        ListIteratorTest.main(args);
        Solution03Test.main(args);
        DoublyLinkedListIteratorTest.main(args);
        DynamicArrayListIteratorTest.main(args);
        Solution04Test.main(args);
        DequeTest.main(args);
        QueueTest.main(args);
        Solution05Test.main(args);
        DequeTest.main(args);
        QueueTest.main(args);
        Solution05Test.main(args);
        CollectionUtilsTest.main(args);
        UnmodifiableCollectionTest.main(args);
        AssociativeArrayTest.main(args);
        LinkedHashMapTest.main(args);
        LinkedHashSetTest.main(args);
        MapTest.main(args);
        SetTest.main(args);
        Solution06Test.main(args);
        HashMapMatrixTest.main(args);
        LinkedBinaryTreeTest.main(args);
        BalanceableTreeTest.main(args);
        BinarySearchTreeTest.main(args);
        NavigableMapTest.main(args);
        NavigableSetTest.main(args);
        SortedMapTest.main(args);
        SortedSetTest.main(args);
        Solution09Test.main(args);



        ArraysTest.main(args);
        CollectionUtilsTest.main(args);
        SortingTest.main(args);
        System.out.println("--------");
        // ...
        System.out.println("--------");
        System.out.println(new Date() + ": tests completed");
    }

}