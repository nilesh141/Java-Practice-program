/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrtngfile;

/**
 *
 * @author niles
 */
import java.util.*;
public class rtngfile {
   private Formatter x;
     public void openFile() {
         try{
             x=new Formatter("writing_in_it.txt");
         }
         catch(Exception e) {
             System.out.println("U have an error");
                      } 
}
     public void addRecords() {
         x.format("%s%s%s","20","nilesh","dubey");
          System.out.println("You created file named 'writing in it' and wrote in it.");
     }
     public void closeFile() {
         x.close();
     }
}
