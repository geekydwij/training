import java.util.Scanner;

public class Menu {
    
    static void executeDataStructureOperations(Scanner scanner) {
        // List
        DataStructures.operateOnList(new java.util.ArrayList<>());
        waitForEnter(scanner);

        // LinkedList
        DataStructures.operateOnLinkedList(new java.util.LinkedList<>());
        waitForEnter(scanner);

        // ArrayList
        DataStructures.operateOnArrayList(new java.util.ArrayList<>());
        waitForEnter(scanner);

        // Map
        DataStructures.operateOnMap(new java.util.HashMap<>());
        waitForEnter(scanner);

        // HashMap
        DataStructures.operateOnHashMap(new java.util.HashMap<>());
        waitForEnter(scanner);

        // LinkedHashMap
        DataStructures.operateOnLinkedHashMap(new java.util.LinkedHashMap<>());
        waitForEnter(scanner);

        // TreeMap
        DataStructures.operateOnTreeMap(new java.util.TreeMap<>());
        waitForEnter(scanner);

        // ConcurrentHashMap
        DataStructures.operateOnConcurrentHashMap(new java.util.concurrent.ConcurrentHashMap<>());
        waitForEnter(scanner);

        // HashTable
        DataStructures.operateOnHashTable(new java.util.Hashtable<>());
        waitForEnter(scanner);

        // Set
        DataStructures.operateOnSet(new java.util.HashSet<>());
        waitForEnter(scanner);

        // HashSet
        DataStructures.operateOnHashSet(new java.util.HashSet<>());
        waitForEnter(scanner);

        // TreeSet
        DataStructures.operateOnTreeSet(new java.util.TreeSet<>());
        waitForEnter(scanner);

        // LinkedHashSet
        DataStructures.operateOnLinkedHashSet(new java.util.LinkedHashSet<>());
        waitForEnter(scanner);

        // Queue
        DataStructures.operateOnQueue(new java.util.LinkedList<>());
        waitForEnter(scanner);

        // PriorityQueue
        DataStructures.operateOnPriorityQueue(new java.util.PriorityQueue<>());
        waitForEnter(scanner);

        // Stack
        DataStructures.operateOnStack(new java.util.Stack<>());
    }

    private static void waitForEnter(Scanner scanner) {
        System.out.println("Press ENTER to continue...");
        scanner.nextLine();

        // Clear console screen
        System.out.print("\033[H\033[2J");
    }
}
