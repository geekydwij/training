import java.util.*;
import java.util.concurrent.*;

public class DataStructures {
    // List
    public static void operateOnList(List<String> list) {
        // Add elements
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        
        // Access elements
        System.out.println("List: " + list);

        // Update elements
        list.set(1, "Updated Element");
        System.out.println("Updated List: " + list);

        // Remove element
        list.remove("Element 1");
        System.out.println("List after removal: " + list);
    }

    // LinkedList
    public static void operateOnLinkedList(LinkedList<String> linkedList) {
        // Add elements
        linkedList.add("Node 1");
        linkedList.add("Node 2");
        linkedList.add("Node 3");

        // Access elements
        System.out.println("LinkedList: " + linkedList);

        // Update elements
        linkedList.set(1, "Updated Node");
        System.out.println("Updated LinkedList: " + linkedList);

        // Remove element
        linkedList.remove("Node 1");
        System.out.println("LinkedList after removal: " + linkedList);
    }

    // ArrayList
    public static void operateOnArrayList(ArrayList<String> arrayList) {
        // Add elements
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");

        // Access elements
        System.out.println("ArrayList: " + arrayList);

        // Update elements
        arrayList.set(1, "Updated Item");
        System.out.println("Updated ArrayList: " + arrayList);

        // Remove element
        arrayList.remove("Item 1");
        System.out.println("ArrayList after removal: " + arrayList);
    }

    // Map
    public static void operateOnMap(Map<String, String> map) {
        // Add key-value pairs
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        map.put("Key3", "Value3");

        // Access elements
        System.out.println("Map: " + map);

        // Update elements
        map.put("Key2", "Updated Value");
        System.out.println("Updated Map: " + map);

        // Remove element
        map.remove("Key1");
        System.out.println("Map after removal: " + map);
    }

    // HashMap
    public static void operateOnHashMap(HashMap<String, String> hashMap) {
        // Add key-value pairs
        hashMap.put("KeyA", "ValueA");
        hashMap.put("KeyB", "ValueB");
        hashMap.put("KeyC", "ValueC");

        // Access elements
        System.out.println("HashMap: " + hashMap);

        // Update elements
        hashMap.put("KeyB", "Updated Value");
        System.out.println("Updated HashMap: " + hashMap);

        // Remove element
        hashMap.remove("KeyA");
        System.out.println("HashMap after removal: " + hashMap);
    }

    // LinkedHashMap
    public static void operateOnLinkedHashMap(LinkedHashMap<String, String> linkedHashMap) {
        // Add key-value pairs
        linkedHashMap.put("KeyX", "ValueX");
        linkedHashMap.put("KeyY", "ValueY");
        linkedHashMap.put("KeyZ", "ValueZ");

        // Access elements
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Update elements
        linkedHashMap.put("KeyY", "Updated Value");
        System.out.println("Updated LinkedHashMap: " + linkedHashMap);

        // Remove element
        linkedHashMap.remove("KeyX");
        System.out.println("LinkedHashMap after removal: " + linkedHashMap);
    }

    // TreeMap
    public static void operateOnTreeMap(TreeMap<String, String> treeMap) {
        // Add key-value pairs
        treeMap.put("KeyP", "ValueP");
        treeMap.put("KeyQ", "ValueQ");
        treeMap.put("KeyR", "ValueR");

        // Access elements
        System.out.println("TreeMap: " + treeMap);

        // Update elements
        treeMap.put("KeyQ", "Updated Value");
        System.out.println("Updated TreeMap: " + treeMap);

        // Remove element
        treeMap.remove("KeyP");
        System.out.println("TreeMap after removal: " + treeMap);
    }

    // ConcurrentHashMap
    public static void operateOnConcurrentHashMap(ConcurrentHashMap<String, String> concurrentHashMap) {
        // Add key-value pairs
        concurrentHashMap.put("KeyM", "ValueM");
        concurrentHashMap.put("KeyN", "ValueN");
        concurrentHashMap.put("KeyO", "ValueO");

        // Access elements
        System.out.println("ConcurrentHashMap: " + concurrentHashMap);

        // Update elements
        concurrentHashMap.put("KeyN", "Updated Value");
        System.out.println("Updated ConcurrentHashMap: " + concurrentHashMap);

        // Remove element
        concurrentHashMap.remove("KeyM");
        System.out.println("ConcurrentHashMap after removal: " + concurrentHashMap);
    }

    // HashTable
    public static void operateOnHashTable(Hashtable<String, String> hashtable) {
        // Add key-value pairs
        hashtable.put("KeyAA", "ValueAA");
        hashtable.put("KeyBB", "ValueBB");
        hashtable.put("KeyCC", "ValueCC");

        // Access elements
        System.out.println("HashTable: " + hashtable);

        // Update elements
        hashtable.put("KeyBB", "Updated Value");
        System.out.println("Updated HashTable: " + hashtable);

        // Remove element
        hashtable.remove("KeyAA");
        System.out.println("HashTable after removal: " + hashtable);
    }

    // Set
    public static void operateOnSet(Set<String> set) {
        // Add elements
        set.add("ElementX");
        set.add("ElementY");
        set.add("ElementZ");

        // Access elements
        System.out.println("Set: " + set);

        // Remove element
        set.remove("ElementX");
        System.out.println("Set after removal: " + set);
    }

    // HashSet
    public static void operateOnHashSet(HashSet<String> hashSet) {
        // Add elements
        hashSet.add("ItemA");
        hashSet.add("ItemB");
        hashSet.add("ItemC");

        // Access elements
        System.out.println("HashSet: " + hashSet);

        // Remove element
        hashSet.remove("ItemA");
        System.out.println("HashSet after removal: " + hashSet);
    }

    // TreeSet
    public static void operateOnTreeSet(TreeSet<String> treeSet) {
        // Add elements
        treeSet.add("ItemP");
        treeSet.add("ItemQ");
        treeSet.add("ItemR");

        // Access elements
        System.out.println("TreeSet: " + treeSet);

        // Remove element
        treeSet.remove("ItemP");
        System.out.println("TreeSet after removal: " + treeSet);
    }

    // LinkedHashSet
    public static void operateOnLinkedHashSet(LinkedHashSet<String> linkedHashSet) {
        // Add elements
        linkedHashSet.add("ItemM");
        linkedHashSet.add("ItemN");
        linkedHashSet.add("ItemO");

        // Access elements
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Remove element
        linkedHashSet.remove("ItemM");
        System.out.println("LinkedHashSet after removal: " + linkedHashSet);
    }

    // Queue
    public static void operateOnQueue(Queue<String> queue) {
        // Add elements
        queue.add("Element1");
        queue.add("Element2");
        queue.add("Element3");

        // Access elements
        System.out.println("Queue: " + queue);

        // Remove element
        queue.poll();
        System.out.println("Queue after removal: " + queue);
    }

    // PriorityQueue
    public static void operateOnPriorityQueue(PriorityQueue<String> priorityQueue) {
        // Add elements
        priorityQueue.add("TaskA");
        priorityQueue.add("TaskB");
        priorityQueue.add("TaskC");

        // Access elements
        System.out.println("PriorityQueue: " + priorityQueue);

        // Remove element
        priorityQueue.poll();
        System.out.println("PriorityQueue after removal: " + priorityQueue);
    }

    // Stack
    public static void operateOnStack(Stack<String> stack) {
        // Add elements
        stack.push("ItemX");
        stack.push("ItemY");
        stack.push("ItemZ");

        // Access elements
        System.out.println("Stack: " + stack);

        // Remove element
        stack.pop();
        System.out.println("Stack after removal: " + stack);
    }
}
