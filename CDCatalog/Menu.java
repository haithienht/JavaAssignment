/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDCatalog;

import java.util.Scanner;

/**
 *
 * @author Thien
 */

public class Menu {
    
    public void showMainMenu(){
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("+     CD Catalog Manager     +");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("+                            +");
        System.out.println("+ 1. Add CD to the catalog   +");
        System.out.println("+ 2. Search CD               +");
        System.out.println("+ 3. Display the catalog     +");
        System.out.println("+ 4. Exit                    +");
        System.out.println("+                            +");
        System.out.println("++++++++++++++++++++++++++++++");
    }
    
    public void showSearchMenu(){
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("+        2. Search CD        +");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("+                            +");
        System.out.println("+ 1. Search by title         +");
        System.out.println("+ 2. Search by Collection    +");
        System.out.println("+ 3. Search by CD Type       +");
        System.out.println("+ 4. Return                  +");
        System.out.println("+                            +");
        System.out.println("++++++++++++++++++++++++++++++");
    }

    public void showMsg(String str){
        Scanner input = new Scanner(System.in);
        String enter;
        double ss;
        int s;
        String s2 = "", s3 = "";

        s = (36-str.length())/2;
        //ss = (36-str.length())/2;
        // Mấy cái dưới tính toán để lấy được canh giữa cho message :))
        if (s%2==0) {
            for (int i = 0; i < s; i++) {
                s2=s2+" ";
            }
            s3=s2;
        }else{ 
            for (int i = 0; i <s; i++) {
                s2=s2+" ";
            }
            for (int i = 0; i <s+1; i++) {
                s3=s3+" ";
            }
        }

        //System.out.println(str.length());
        //System.out.println(s);
        System.out.println("");
        System.out.println("++++++++++++  Message  +++++++++++++");
        System.out.printf("%s%s%s\n",s2,str,s3);
        System.out.println("++++++++++++++++++++++++++++++++++++");

        
    }
}
