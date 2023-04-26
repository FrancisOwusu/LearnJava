/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.collections;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class UsingToArray {
     // creates a LinkedList, adds elements and converts to array
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        
        links.addLast("red"); //add as last item
        links.add("pink");//add to the end
        links.add(3,"green");//add at 3rd index
        links.addFirst("cyan");//add as first item
        
        //get LinkedList elements as an array
        colors = links.toArray(new String[links.size()]);
        
        System.out.println("Colors: ");
        
        for(String color : colors){
        System.out.println(color);
                }
    }
}//end class UsingToArray
