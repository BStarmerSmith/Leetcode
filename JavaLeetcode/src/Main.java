package JavaLeetcode.src;
import JavaLeetcode.src.easy.*;
import JavaLeetcode.src.medium.*;

public class Main {
    public static void main(String[] args) {
        Main.run_easy();
        Main.run_medium();
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
}