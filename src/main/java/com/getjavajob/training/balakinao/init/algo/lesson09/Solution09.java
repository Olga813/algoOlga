package com.getjavajob.training.balakinao.init.algo.lesson09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution09 {

    public static void main(String[] args) {
        RedBlackTree<Integer> redBlackTree1 = new RedBlackTree<>();
        //Новый узел является корневым
        redBlackTree1.add(17);

        //  родительский узел красного цвета, а корневой красный
        redBlackTree1.add(9);
        redBlackTree1.add(90);
        redBlackTree1.add(1);
        redBlackTree1.add(5);
        System.out.println(redBlackTree1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city or part of a city: ");
        String city = scanner.next();
        Path path = Path.of("src", "main",
                "java", "com", "getjavajob", "training", "balakinao", "init", "algo", "lesson09", "city.txt");
        Path path2 = Path.of("src", "main",
                "java", "com", "getjavajob", "training", "balakinao", "init", "algo", "lesson09", "cityResult");
        System.out.println(city);
        SortedSet sortedCity = sortCity(city, path);
        System.out.println(sortedCity);
        try {
            Files.writeString(path2, sortedCity.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
        //  родительский и дочерний узлы красного цвета
        //redBlackTree1.add(18);
        // redBlackTree1.add(75);
        // redBlackTree1.add(81);
        //  System.out.println(redBlackTree1.preOrder());

        // вставляем в лево, родительский узел красный, дядя черный
        // RedBlackTree<Integer> redBlackTree2 = new RedBlackTree<>();
        //redBlackTree2.add(17);
        // redBlackTree2.add(9);
        // redBlackTree2.add(19);
        //redBlackTree2.add(75);
        // redBlackTree1.add(24);
        //  System.out.println(redBlackTree2.preOrder());

// вставляем вправо, родительский узел красный, дядя черный
        //RedBlackTree<Integer> redBlackTree3 = new RedBlackTree<>();
        //redBlackTree3.add(17);
        // redBlackTree3.add(9);
        // redBlackTree3.add(19);
        //redBlackTree3.add(75);
        // redBlackTree3.add(81);
        //  System.out.println(redBlackTree3.preOrder());

        // удаление корня
        // RedBlackTree<Integer> redBlackTree4 = new RedBlackTree<>();
        //redBlackTree4.add(17);
        // redBlackTree4.deleteNode(17);
        //  System.out.println(redBlackTree4.preOrder());

// удаление родной брат красного цвета
        // RedBlackTree<Integer> redBlackTree5 = new RedBlackTree<>();
        //redBlackTree5.add(17);
        // redBlackTree5.add(9);
        // redBlackTree5.add(19);
        //redBlackTree5.add(18);
        // redBlackTree5.add(75);
        // redBlackTree5.deleteNode(9);
        //  System.out.println(redBlackTree5.preOrder());

        // Брат черный и имеет двух черных дочерних элементов, родительский элемент красный, сам элемент правый
     //   RedBlackTree<Integer> redBlackTree6 = new RedBlackTree<>();
        //redBlackTree6.add(17);
        // redBlackTree6.add(9);
        // redBlackTree6.add(3);
        // redBlackTree6.add(12);
        // redBlackTree6.add(19);
        //redBlackTree6,add(18);
        // redBlackTree6.add(75);
        // redBlackTree6.deleteNode(75);
        //  System.out.println(redBlackTree6.preOrder());

        // Брат черный и имеет двух черных дочерних элементов, родительский элемент красный, сам элемент левый
        RedBlackTree<Integer> redBlackTree7 = new RedBlackTree<>();
        //redBlackTree7.add(17);
        // redBlackTree7.add(9);
        // redBlackTree7.add(3);
        // redBlackTree7.add(12);
        // redBlackTree7.add(19);
        //redBlackTree7.add(18);
        // redBlackTree7.add(75);
        // redBlackTree7.deleteNode(18);
        //  System.out.println(redBlackTree7.preOrder());

// Брат черный и имеет двух черных дочерних элементов, родительский элемент красный, сам элемент левый
        RedBlackTree<Integer> redBlackTree10 = new RedBlackTree<>();
        //redBlackTree10.add(17);
        // redBlackTree10.add(9);
        // redBlackTree10.add(3);
        // redBlackTree10.add(12);
        // redBlackTree10.add(19);
        //redBlackTree10.add(18);
        // redBlackTree10.add(75);
        // redBlackTree10.deleteNode(18);
        //  System.out.println(redBlackTree10.preOrder());


//5, Родной брат черный и имеет по крайней мере одного красного потомка, "внешний племянник" черный
        RedBlackTree<Integer> redBlackTree8 = new RedBlackTree<>();
        //redBlackTree8.add(17);
        // redBlackTree8.add(9);
        // redBlackTree8.add(19);
        // redBlackTree8.add(18);
        // redBlackTree8.add(75);
        //redBlackTree8.add(24);
        // redBlackTree8.deleteNode(18);
        //  System.out.println(redBlackTree8.preOrder());

//Пример 6: Брат черный и имеет по крайней мере одного красного дочернего элемента, "внешний племянник" красный
        RedBlackTree<Integer> redBlackTree9 = new RedBlackTree<>();
        //redBlackTree9.add(17);
        // redBlackTree9.add(9);
        // redBlackTree9.add(19);
        // redBlackTree9.add(18);
        // redBlackTree9.add(75);
        //redBlackTree9.add(24);
        //redBlackTree9.add(81);
        // redBlackTree9.deleteNode(18);
        //  System.out.println(redBlackTree9.preOrder());

    public static SortedSet sortCity(String city, Path path) {
        SortedSet<String> treeSetCity = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        try (Scanner scanner = new Scanner(path)) {
            while ((scanner.hasNext())) {
                treeSetCity.add(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String upperBound = handleSubStr(city);
        if (upperBound.isEmpty()) {
            return treeSetCity.tailSet(city);
        } else {
            SortedSet<String> sortedSet = treeSetCity.subSet(city, upperBound);
            return sortedSet;
        }
    }

    private static String handleSubStr(String city) {
        StringBuilder stringBuilder = new StringBuilder(city);
        int stringBuilderLenght = stringBuilder.length();
        while (stringBuilderLenght > 0 && stringBuilder.charAt(stringBuilderLenght - 1) == Character.MAX_VALUE) {
            stringBuilder.deleteCharAt(--stringBuilderLenght);
        }
        if (stringBuilderLenght == 0) {
            return "";
        }
        int lastInd = stringBuilderLenght - 1;
        stringBuilder.setCharAt(lastInd, (char) (stringBuilder.charAt(lastInd) + 1));
        return stringBuilder.toString();
    }


    }
