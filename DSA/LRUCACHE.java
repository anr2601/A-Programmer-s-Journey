import java.util.*;

public class LRUCACHE {

    class Node{
        Node prev, next;
        int key, value;
        Node(int _key, int _value){
            key = _key;
            value =_value;
        }
    }

    Node head = new Node(0,0), tail = new Node(0,0);
    HashMap<Integer, Node> map = new HashMap<>();
    int capacity;

    public LRUCACHE(int _capacity){
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    private void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }



}
