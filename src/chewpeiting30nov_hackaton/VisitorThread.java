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
public class VisitorThread extends Thread {
    ThemePark tp ;
    
    
    public VisitorThread(ThemePark tp){
        this.tp=tp;
    }
    
    public void run(){
        try{
            for(int i=0; i <80 ;i++){
                Thread.sleep(100);
                tp.QueueForTicket();
                tp.PassEntranceGate();
                 int opt = (int)((Math.random()*2)+1);
                tp.waterslides(opt);
                    int opt2 = (int)((Math.random()*10)+1);
                tp.Left(opt2);
            }
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
