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
public class CDData {
    Scanner input;
    String colName, CDType, title, id;
    int price, YOR;
    
    public CDData(){
        input = new Scanner(System.in);
        
        
        do{
        System.out.print("Enter CD ID: ");
        this.id = input.nextLine();
            if (this.id.isEmpty()) {
                new Menu().showMsg("CD ID cannot be blank");
            }
        }while(this.id.isEmpty());
        
        
        do{
        System.out.print("Enter Collection Name(game/movie/music): ");
        this.colName = input.nextLine();
            if (!this.colName.equals("game")&&!this.colName.equals("music")&&!this.colName.equals("movie")) {
                new Menu().showMsg("Wrong Collection name!");
            }
        }while(!this.colName.equals("game")&&!this.colName.equals("music")&&!this.colName.equals("movie"));
        
        
        do{
        System.out.print("Enter CD Type(audio or video): ");
        this.CDType = input.nextLine();
            if (!this.CDType.equals("audio")&&!this.CDType.equals("video")) {
                    new Menu().showMsg("Wrong CD Type!");
            }
        }while(!this.CDType.equals("audio")&&!this.CDType.equals("video"));
        
        
        do{
        System.out.print("Enter CD Title: ");
        this.title = input.nextLine();
            if (this.title.isEmpty()) {
                new Menu().showMsg("Title cannot be blank");
            }
        }while(this.title.isEmpty());
        
        
        System.out.print("Enter price: ");
        this.price = input.nextInt();
        
        
        System.out.print("Enter CD's year of release: ");
        this.YOR = input.nextInt();
        
    }
    
    public String showDetail(){
        return id+"\t\t"+colName+"\t\t"+CDType+"\t\t"+title+"\t\t"+price+"\t\t"+YOR;
        //return id+"\t"+title;
    }
    
}
