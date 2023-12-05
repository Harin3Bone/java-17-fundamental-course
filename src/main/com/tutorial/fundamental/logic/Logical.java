package com.tutorial.fundamental.logic;

import java.util.List;
import java.util.Map;

public class Logical {

    public void ifStatementTypeOne(int x, int y) {
        if (x < y) {
            System.out.println("X is less than Y");
        } else if (x == y) {
            System.out.println("X is equal Y");
        } else {
            System.out.println("X is more than Y");
        }
    }

    public void ifStatementTypeTwo(int x, int y) {
        var z = x < y
                ? "X is less than Y"
                : "X is more or equal Y";
        System.out.println(z);
    }

    public void forLoopEachIndex(int max) {
        for (var i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void forEachInList(List<Integer> dataList) {
        for (var data : dataList) {
            System.out.println(data);
        }
    }

    public void forEachStreamInList(List<Integer> dataList) {
        dataList.forEach(data -> System.out.println(data));
    }

    public void whileLoop(int max) {
        var i = 0;

        while (i <= max) {
            System.out.println(i);
            i++;
        }
    }

    public void switchCase(int x) {
        switch (x) {
            case 1:
                System.out.println("X = 1");
                break;
            case 2:
                System.out.println("X = 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("X is in range 3 - 5");
                break;
            default:
                System.out.println("X is not match any case.");
                break;
        }
    }

    public String switchCaseReturn(int x) {
        switch (x) {
            case 1:
                return "X = 1";
            case 2:
                return "X = 2";
            case 3:
            case 4:
            case 5:
                return "X is in range 3 - 5";
            default:
                return "X not match any case";
        }
    }
}
