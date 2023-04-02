/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doubly;

/**
 *
 * @author NQDtotty
 */
public class FlowerList {
    
    Node head;
    Node tail;

    public FlowerList() {
        head = tail = null;
    }
    
    public boolean Empty() {
        return head == null;
    }
    
    public boolean addFirst(Flower f) {
        Node newNode  = new Node(f);
        if(this.Empty()) head = tail = newNode;
        else {
            newNode.next = head;
            newNode.previous = null;
            head.previous = newNode;
            head = newNode;
        }
        return true;
    }
    
    public boolean addFirst(String name, String original, int price) {
        return addFirst(new Flower(name, original, price));
    }
    
    public boolean addLast(Flower f) {
        Node newNode = new Node(f);
        if(this.Empty()) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.next = null;
            newNode.previous = tail;
            tail = newNode;
        }
        return true;
    }
    
    public boolean addLast(String name, String original, int price) {
        return addLast(new Flower(name, original, price));
    }
    
    public boolean addBefore(Node p, Flower f) {
        if(this.Empty() || p == head) return addFirst(f);
        else {
            Node newNode = new Node(f);
            Node before = p.previous;
            
            before.next = newNode;
            newNode.next = p;
            p.previous = newNode;
            newNode.previous = before;
        }
        return true;
    }
    
    public boolean addAfter(Node p, Flower f) {
        if(this.Empty() || p == tail) return addLast(f);
        else {
            Node newNode = new Node(f);
            Node after = p.next;
            
            p.next = newNode;
            newNode.next = after;
            after.previous = newNode;
            newNode.previous = p;
        }
        return true;
    }
    
    public Node search(String flowerName) {
        if(this.Empty()) return null;
        Flower f = new Flower(flowerName);
        Node p = head;
        while(p != null) {
            if(p.flower.equals(f)) return p;
            else p = p.next; 
        }
        return null;
    }
    
    public Node removeFirst() {
        if(this.Empty()) return null;
        Node result = head;
        if(head == tail) head = tail = null;
        else {
            Node newHead = head.next;
            newHead.previous = null;
            head = newHead;
        }
        return result;
    }
    
    public Node removeLast() {
        if(this.Empty()) return null;
        Node result = tail;
        if(head == tail) head = tail = null;
        else {
            Node newTail = tail.previous;
            newTail.next = null;
            tail = newTail;
        }
        return result;
    }
    
    public Node remove(Node p) {
        if(this.Empty() || p == null) return null;
        if(p == head) return removeFirst();
        if(p == tail) return removeLast();
        Node before = p.previous;
        Node after = p.next;
        before.next = after;
        after.previous = before;
        return p;
    }
    
    public Flower remove (String flowerName) {
        Node p = this.search(flowerName);
        Node removeNode = remove(p);
        return (removeNode != null) ? removeNode.flower : null;
    }
    
    public void printAll() {
        if(this.Empty()) System.out.println("Empty list!");
        else {
            for(Node p = head; p != null; p = p.next) {
                System.out.println(p.flower);
            }
        }
    }
    
    public void printAll_reverse() {
        if(this.Empty()) System.out.println("Empty list!");
        else {
            for(Node p = tail; p != null; p = p.previous) {
                System.out.println(p.flower);
            }
        }
    }
    
    public void printAll_Org(String original) {
        if(this.Empty()) System.out.println("Empty list!");
        else {
            for(Node p = head; p != null; p = p.next) {
                if(p.flower.original.equals(original)) {
                    System.out.println(p.flower);
                }
            }
        }
    }
}
