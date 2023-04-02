/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoice;

import java.util.LinkedList;
import java.util.Random;
/**
 *
 * @author NQDtotty
 */
public class Customer extends Thread {
    
    static Random rand = new Random(System.currentTimeMillis());
    long delay;
    LinkedList<String> queue;
    Thread acc;

    public Customer(String custName, long delay, LinkedList<String> queue, Thread acc) {
        super(custName);
        this.delay = delay;
        this.queue = queue;
        this.acc = acc;
    }
    
    @Override
    public void run() {
        while(acc.isAlive()) {
            try {
               int price = 100 + rand.nextInt(100);
               String msg = this.getName() + ", " + price + "$";
               queue.addLast(msg);
               if(!acc.isAlive()) this.yield();
               else this.sleep(delay);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
    
}
