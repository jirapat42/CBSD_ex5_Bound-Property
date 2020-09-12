/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbsd_ex5_bound.property;
import java.util.Scanner;
/**
 *
 * @author 61050151
 */
public class CBSD_ex5_BoundProperty {

    /**
     * @param args the command line arguments
     */
             
    public static void main(String[] args) {
        MyProperty source = new MyProperty();
        User1 user1 = new User1();
        User2 user2 = new User2();
        source.addPropertyChangeListener(user1);
        source.addPropertyChangeListener(user2);
        
        Scanner inputScore = new Scanner(System.in);
        String Score="";
        
       for(;;){
            System.out.print("Enter Score:");
            Score = inputScore.nextLine();
            source.setScore(Score);
           
            if(Score.equals("")){
                 break;  
          }
       }
        
    }
    
}
