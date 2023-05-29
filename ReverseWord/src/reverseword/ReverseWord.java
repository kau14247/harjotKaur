/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;

import java.util.Scanner;


public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        String word= input.next();
        char[] reverse= new char[word.length()];
        for(int i=0; i<word.length(); i++)
        {
            reverse[i] = word.charAt(i);
        }
        for(int i=reverse.lenth-1; i>=0; i-- )
        {
            System.out.println(reverse[i]);
        }
        
        
    }
    
}
