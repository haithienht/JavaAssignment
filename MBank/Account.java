/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MBank;

import java.util.Scanner;

/**

 * @author Thien
 */

public class Account {
    String cName;
    int accNumber, accBalance;
    Scanner in;
    
    public Account(){
        in = new Scanner(System.in);
        System.out.print("Enter Customer name: ");
        cName = in.nextLine();
        
        do{
        System.out.print("Enter Account balance: ");
        accBalance = in.nextInt();
        if (accBalance<100) {
            System.out.println("Account balance cannot be less than 100");
        }
        }while(accBalance<100);
    }

}
