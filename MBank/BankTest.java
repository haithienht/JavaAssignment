/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MBank;

import java.util.Scanner;

/**
 *
 * @author Thien
 */
public class BankTest {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Bank objBank = new Bank();
        // TODO code application logic here
        while(true){
            int choice;
            Scanner in = new Scanner(System.in);
            /*
            System.out.println("");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("+       Merchants Bank       +");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("+ 1. Create new account      +");
            System.out.println("+ 2. Withdraw cash           +");
            System.out.println("+ 3. Depostit                +");
            System.out.println("+ 4. Exit                    +");
            System.out.println("++++++++++++++++++++++++++++++");
            
            System.out.print("Enter choice(1-4): ");
            */
            System.out.println("");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("+  Ngan hang Merchants Bank  +");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("+ 1. Tao tai khoan moi       +");
            System.out.println("+ 2. Rut tien                +");
            System.out.println("+ 3. Nap tien vao tai khoan  +");
            System.out.println("+ 4. Thoat                   +");
            System.out.println("++++++++++++++++++++++++++++++");
            
            System.out.print("Lua chon (1-4): ");
            choice = in.nextInt();
            
            switch(choice){
                case 1:
                    objBank.createAccount();
                    break;
                case 2:
                    objBank.withdraw();
                    break;
                case 3: 
                    objBank.deposit();
                    break;
                case 4:
                    System.exit(0);
            }
            
        }
        
    }
    
}
