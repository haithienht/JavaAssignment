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
public class Bank {
    int nextAcc, maxAcc=5, nextAccNum=1001;
    Account[] Acc;
    Account objA;
    Scanner in;
    
    public Bank(){
        Acc = new Account[maxAcc];
    }
    
    public void displayAccountDetail(String acc){
        for (int i = 0; i < nextAcc; i++) {
            if(Acc[i].cName.equals(acc)){
                //System.out.println("Account No. "+Acc[i].accNumber+"("+Acc[i].cName+"), you have: "+Acc[i].accBalance+" in your balance.");
                showMsg("Khach hang "+Acc[i].cName+"(So TK: "+Acc[i].accNumber+") co: "+Acc[i].accBalance+" trong TK.");
            }      
        }
    }
    
    public void createAccount(){
        
        if(nextAcc==maxAcc){
            //showMsg("Accounts is full");
            showMsg("So luong tai khoan da day!");
            return;
        }
        objA = new Account();
        Acc[nextAcc] = objA;
        
        Acc[nextAcc].accNumber = this.nextAccNum;
        //System.out.println("Your account number: "+Acc[nextAcc].accNumber);
        System.out.println("So tai khoan cua ban: "+Acc[nextAcc].accNumber);

        //showMsg("Sucessfully created account");
        showMsg("Tao tai khoan thanh cong!");
        nextAccNum++;
        nextAcc++;
    }
    
    public void withdraw(){
        Scanner input = new Scanner(System.in);
        int inAccNum,withdraw;
        int ID;
        boolean check=false;
        if(nextAcc==0){
            //System.out.println("There's no account in bank");
            showMsg("Khong co tai khoan trong ngan hang");
            return;
        }
        //System.out.print("Enter account number: ");
        System.out.print("Hay nhap so tai khoan: ");
        inAccNum = input.nextInt();
        
        for (int i = 0; i < nextAcc; i++) {
            if (Acc[i].accNumber==inAccNum) {
                //System.out.println("Account No. "+Acc[i].accNumber+"("+Acc[i].cName+"), you have: "+Acc[i].accBalance+" in your balance.");
                displayAccountDetail(Acc[i].cName);
                //System.out.print("Enter amount you want to withdraw: ");
                System.out.print("Nhap so tien ban muon rut ra: ");
                withdraw = input.nextInt();
                if ((withdraw >Acc[i].accBalance)||(withdraw<100)) {
                    //System.out.println("The amount must be less than your balance and greater than 100");
                    showMsg("So tien muon rut phai < tien trong tai khoan, hoac > 100");
                    return;
                }
                Acc[i].accBalance = Acc[i].accBalance-withdraw;
                //System.out.println("Withdraw successfull");
                showMsg("Rut tien thanh cong!");
                return;
            }else{
                check=true;
            }
        }
        
        if (check=true) {
            //showMsg("Cannot find account with: "+inAccNum);
            showMsg("Khong the tim tai khoan: "+inAccNum);
        }
        
    }
    
    public void deposit(){
        Scanner input = new Scanner(System.in);
        int inAccNum,deposit;
        boolean check=false;
        
        if(nextAcc==0){
            showMsg("Khong co tai khoan trong ngan hang");
            return;
        }
        
        System.out.print("Hay nhap so tai khoan: ");
        inAccNum = input.nextInt();
        
        for (int i = 0; i < nextAcc; i++) {
            if (Acc[i].accNumber==inAccNum) {
                //System.out.println("Account No. "+Acc[i].accNumber+"("+Acc[i].cName+"), you have: "+Acc[i].accBalance+" in your balance.");
                displayAccountDetail(Acc[i].cName);
                System.out.print("Nhap so tien ban muon nap vao: ");
                deposit = input.nextInt();
                if (deposit<=0) {
                    System.out.println("So tien nap vao phai > 0");
                    return;
                }

                Acc[i].accBalance = Acc[i].accBalance+deposit;
                showMsg("Nap tien thanh cong!");
                return;
            }else{
                check=true;
            }
        }
        
        if (check=true) {
            showMsg("Khong the tim tai khoan: "+inAccNum);
        }
    }
    
    public void showMsg(String str){
        Scanner input = new Scanner(System.in);
        String enter;
        double ss;
        int s;
        String s2 = "", s3 = "";

        s = (60-str.length())/2;
        //ss = (36-str.length())/2;
        // Mấy cái dưới tính toán để lấy được canh giữa cho message ở dưới :))
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
        System.out.println("++++++++++++++++++++++++  Message  +++++++++++++++++++++++++");
        System.out.printf("%s%s%s\n",s2,str,s3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        
    }
    
    
}
