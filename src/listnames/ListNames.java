/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listnames;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author mattm
 */
public class ListNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList();
        
        names.add("James");
        display(names);
        
        names.add("Mike");
        names.add("Paul");
        display(names);
        
        names.add(1, "Dave");
        
        names.add(3,"Jack");
        
        display(names);
        
        names.remove("Dave");
        
        display(names);
        names.set(0, "Jameson");
        display(names);
    }
    public static void display(ArrayList<String> dispArray){
        JOptionPane.showMessageDialog(null,"ArrayList size:" + dispArray.size());
        
        for (int i = 0; i < dispArray.size(); i++) {
            
            JOptionPane.showMessageDialog(null, 
                    "Value at index " + i + ": " + dispArray.get(i));
        }
    }
}
