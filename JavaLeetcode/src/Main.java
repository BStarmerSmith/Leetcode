package JavaLeetcode.src;

import JavaLeetcode.src.easy.*;
import JavaLeetcode.src.medium.*;
import JavaLeetcode.src.hard.*;

public class Main {
    public static void main(String[] args) {
        Main.run_easy();
        Main.run_medium();
        Main.run_hard();
    }

    public static void run_easy() {
        System.out.println("Running Easy Tests");
        System.out.println("====================================");
        RemoveDuplicates remove_dups = new RemoveDuplicates();
        remove_dups.testDuplicates();
        System.out.println("====================================");
    }

    public static void run_medium() {
        System.out.println("Running Medium Tests");
        System.out.println("====================================");
        AddTwoList addtwolist = new AddTwoList();
        addtwolist.testSolution();
        System.out.println("====================================");
    }

    public static void run_hard() {
        System.out.println("Running Hard Tests");
        System.out.println("====================================");
        MedianSortArr medianSortArr = new MedianSortArr();
        medianSortArr.testDuplicates();
        System.out.println("====================================");
    }
}