/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chewpeiting30nov_hackaton;

/**
 *
 * @author user
 */
public class ThemePark {
    int visitor = 0;
    int left;
    
    public ThemePark(){
        System.out.println("**** Welcome to Waterslide Theme Park ****");
    }
    
    public synchronized void QueueForTicket(){
        System.out.println("Visitor queuing for ticket....");
    }
    
    public synchronized void PassEntranceGate(int num) throws InterruptedException{
        while(visitor > 75){
            System.out.println("!! Max 75visitors only. Visitor waiting to enter... !!");
            wait();
        }
        
        System.out.println(num+" visitor enter the Water Park..");
        visitor = visitor+num;
        notify();
    }
    
    public synchronized void waterslides(int option) {
        switch(option){
            case(1):System.out.println("    Visitor choose to sit directly on th slide");
                    break; 
            case(2):System.out.println("    Visitor choose on a raft to tube designed to be used with the slide");
                    break;
        }
        notify();
       
    }
    
    public synchronized void Left(int left) throws InterruptedException{
        
        System.out.println(left+ " visitor Leaving Theme Park.....");
        System.out.println(left+" of visitor are allowed to enter.");
        visitor = visitor - left;
        notify();
    }
    
}
