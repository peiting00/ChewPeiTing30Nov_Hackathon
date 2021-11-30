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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ThemePark tp = new ThemePark();
        
        VisitorThread vt = new VisitorThread(tp);
        
            vt.start();
        
        
    }
    
}
